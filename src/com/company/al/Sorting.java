package com.company.al;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {

    public static void main(String[] arg) {

       // sortStrings();
        //sortStringsBasedOnLength();
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("mehdi","hamzehlou",LocalDate.parse("2021-03-02")));
        employees.add(new Employee("Ali","tehrani",LocalDate.parse("2022-04-12")));

        multiple_sort(employees);
    }

    public static void sortStrings() {
        String[] names = {"One", "Two", "Three", "Four", "Five", "Six"};
        Stream.of(names).sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }

    private static void sortStringsBasedOnLength() {
        String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        Stream.of(names)
                .sorted((o1, o2) -> Integer.compare(o1.length(), o2.length()))
                .forEach(System.out::println);
    }

    public static class Employee{
        String firstName;
        String lastName;
        LocalDate hire = null;
        public  Employee(String fname,String lname,LocalDate hire){
             this.hire= hire;
            this.firstName= fname;
            this.lastName= lname;
        }
        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public LocalDate getHireDate(){
            return hire;
        }
    }
    private static void sortEmployees(List<Employee> employees){
        employees.parallelStream()
                .sorted((o1, o2) -> o1.getHireDate().compareTo(o2.getHireDate()))
                .forEach(employee -> System.out.println("employee = " + employee.firstName));
    }

    private static void sortEmployees2(List<Employee> employees) {
        employees.parallelStream()
                .sorted(Comparator.comparing(Employee::getHireDate))
                .forEach(employee -> System.out.println("employee = " + employee.firstName));
    }
    public static void multiple_sort(List<Employee> employees) {
        Comparator<Employee> byFirstName = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
        Comparator<Employee> byLastName = (e1, e2) -> e1.getLastName().compareTo(e2.getLastName());
        employees.stream()
                .sorted(byFirstName.thenComparing(byLastName))
                .forEach(e -> System.out.println("employee = " + e.firstName));
    }

}

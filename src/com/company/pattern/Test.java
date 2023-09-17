package com.company.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;


public class Test {
    /*
    public void removeFromCollection(List<Integer> marks) {
        for (Integer mark : marks) {
            if (mark < 40)
                marks.remove(mark); //==> Will throw java.util.ConcurrentModificationException
        }

//        List<Integer> collect1  = Stream.of(10, 20, 50, 60).toList();
//        collect1.removeIf(i -> i>15);
//        collect1.forEach(System.out::println);



    }
    public static void main1(String[] args) {
       // Test test = new Test();
       // test.removeFromCollection(new ArrayList<Integer>(asList(10, 20, 50, 60)));

        List<Integer> collect1 = Stream.of(10, 20, 30, 40).collect(toList());
        collect1.removeIf(integer -> integer > 15);
        collect1.forEach(System.out::println);

    }
    */
    static class Resource {
        final String name;
        Resource(String name) {
            this.name = name;
        }
        synchronized void print() {
            System.out.println("this is resource " + name);
        }
        synchronized void print(Resource another) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            }
            catch (InterruptedException e) {}
            System.out.println("Thread "+Thread.currentThread().getName()+" acquired resource " + name);
            another.print(); // --> The line that could cause a deadlock
        }
    }
    public static void main(String[] args) {
        final Resource r1 = new Resource("r1");
        final Resource r2 = new Resource("r2");
        new Thread(() -> r1.print(r2)).start();
        new Thread(() -> r2.print(r1)).start();
    }
}


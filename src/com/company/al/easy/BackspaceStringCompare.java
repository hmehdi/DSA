package com.company.al.easy;

public class BackspaceStringCompare {


    public boolean backspaceCompare(String s, String t) {

        String finalS = processString(s);
        String finalT = processString(t);

        return finalS.equals(finalT);
    }

    private String processString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BackspaceStringCompare solution = new BackspaceStringCompare();

        // Example test case
        String s = "ab#c";
        String t = "ad#c";
        boolean result = solution.backspaceCompare(s, t);
        System.out.println(result);  // Output: true
    }
}

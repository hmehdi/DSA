package com.company.al.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        s = s.trim();
        int i = s.length()-1;
        int lg =0;
        while (i>=0){
            if(s.charAt(i) == ' '){
                return lg;
            }
            lg++;
            i--;
        }

        return lg;
    }

    public int lengthOfLastWordB(String s) {
        int length = 0;
        boolean wordStarted = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
                wordStarted = true;
            } else if (wordStarted) {
                break;
            }
        }
        return length;
    }
    public static void main(String... args){
        String input = "   fly me   to   the moon  ";
        System.out.println(new LengthOfLastWord().lengthOfLastWordB(input));
    }
}

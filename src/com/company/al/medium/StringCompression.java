package com.company.al.medium;

public class StringCompression {

    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();

        Character tmp = chars[0];
        int countChar= 1;
        for(int i =1; i< chars.length; i++){
            if(tmp == chars[i]){
                countChar +=1;
            }else{
                String c = (countChar>1)? String.valueOf(countChar):"";
                sb.append(tmp+c);
                countChar=1;
                tmp=chars[i];
            }
        }
        String c = (countChar>1)? String.valueOf(countChar):"";
        sb.append(tmp.toString()+c);
        System.out.println(sb.toString());
        return sb.toString().length();
    }
    public int compress2(char[] chars) {
        int index = 0; // index to track the current position in the compressed array
        int i = 0; // pointer to iterate through the input array

        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            chars[index++] = chars[i]; // write the character
            if (j - i > 1) {
                String count = String.valueOf(j - i);
                for (char c : count.toCharArray()) {
                    chars[index++] = c; // write the count as characters
                }
            }
            i = j; // move to the next character
        }

        return index; // return the length of the compressed array
    }
    public static void main(String... args){
        //char[] chars = {'a','a','b','b','c','c','c'}; // return 6 ["a","2","b","2","c","3"]
        //char[] chars = {'a'}; // return 1 ["a"]
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'}; // return 1 ["a","b","12]

        int length = new StringCompression().compress2(chars);

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
            System.out.println("");
        }
    }
}

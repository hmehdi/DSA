package com.company.al.easy;

public class AddBinaryString {

/*
  In binary addition, a carry refers to the situation where the sum of two bits is greater than or equal to 2.
   When this happens, a carry needs to be propagated to the next bit position.

   when the sum of two binary digits is greater than 1, a carry is generated.
   a carry refers to the situation where the sum of two bits is greater than or equal to 2.

 */
    public String addBinary(String a, String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // convert to integer
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0'; // convert to integer
                j--;
            }

            carry = sum / 2;
            result.append(sum % 2);
        }

        if (carry > 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }


    public static void main(String... args){



        String a = "1110";
        String b = "0111";
        AddBinaryString abObj = new AddBinaryString();
        String out = abObj.addBinary(a,b);

        System.out.println(out);



//        String binaryString = "101010"; // Example binary string
//
//         // Convert binary string to an integer
//        int decimalValue = Integer.parseInt(binaryString, 2);
//        System.out.println("Decimal value: " + decimalValue);
//
//        // Convert an integer to a binary string
//        int number = 42; // Example decimal number
//        String binaryString2 = Integer.toBinaryString(number);
//        System.out.println("Binary string: " + binaryString2);
//
//        // Perform bitwise operations on binary strings
//        String binaryString3 = "1100";
//        String binaryString4 = "1010";
//        int bitwiseAnd = Integer.parseInt(binaryString3, 2) & Integer.parseInt(binaryString4, 2);
//        System.out.println("Bitwise AND: " + Integer.toBinaryString(bitwiseAnd));




    }
}

package ch_03;

import java.util.Scanner;

public class Exercise03_09 {

    /*
    (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of
    10 digits:d1d2d3d4d5d6d7d8d9d10. The last digit, d10 is a checksum, which is calculated from the other 9 digits
    using the following formula:

                    (d1 x 1 + d2 X 2 + d3 x 3 + d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) %11

    If the check sum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that
    prompts the user to enter the first 9 digits and displays the 10-digit ISBN(including leading zeros). Your program
    should read the input as an integer.
    Here are sample runs:

    Enter the first 9 digits of an ISBN as Integer: 013601267
    The ISBN-10 number is 0136012671

    Enter the first 9 digits of an ISBN as Integer: 0013031997
    The ISBN-10 number is 0013031997X

    Enter the first 9 digits of an ISBN as integer: 434539934
    The ISBN-10 number is 4345399343
    * */

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as an integer: ");
       String ISBNNumber = userInput.next();

        int[] digits = new int[9];
        try{
            for (int i = 0; i<=8; i++) {
                digits[i] = Character.getNumericValue(ISBNNumber.charAt(i));
            }

            int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
            d1 = digits[0];
            d2 = digits[1];
            d3 = digits[2];
            d4 = digits[3];
            d5 = digits[4];
            d6 = digits[5];
            d7 = digits[6];
            d8 = digits[7];
            d9 = digits[8];

            d10 = ((d1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) %11;


            if (d10 == 10 || ISBNNumber.length()>9){
                System.out.println("The ISBN-10 number is " + ISBNNumber + "X");
            } else {
                System.out.println("The ISBN-10 number is " + ISBNNumber + d10);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The ISBN-10 number is " + ISBNNumber + "X");
        }

    }
}

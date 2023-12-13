package ch_03;

import java.util.Scanner;

public class Exercise03_12 {

    /*
    * (Palindrome integer) Write a program that prompts the user to enter a three-digit integer and determines whether
    * it is a palindrome integer. An integer is palindrome if it reads the same from right to left and from left to
    * right.  negative integer is treated the same as a positive integer.
    * Here are sample runs of this program:
    * Enter a three-digit integer: 121
    * 121 is a palindrome
    *
    * Enter a three-digit integer: 123
    * 123 is not a palindrome
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit integer");

        int threeDigitInteger = scanner.nextInt();
        int baseNumber = threeDigitInteger;
        int reverse = 0;

        if (baseNumber<0){
            threeDigitInteger *= -1;
        }

        while (threeDigitInteger >0){
            int lastDigit = threeDigitInteger%10;
            reverse = reverse*10 + lastDigit;
            threeDigitInteger = threeDigitInteger/10;
        }

        if (baseNumber<0){
            reverse *= -1;
        }
        if(baseNumber==reverse){
            System.out.println(baseNumber + " is a palindrome");
        } else {
            System.out.println(baseNumber + " is not a palindrome");
        }
    }
}

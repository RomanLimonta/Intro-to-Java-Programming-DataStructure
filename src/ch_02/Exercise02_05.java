package ch_02;

import java.util.Scanner;

public class Exercise02_05 {
    /*(Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then
    computes the gratuity and total. For example, if the user enters 10 for subtotal nd 15% for gratuity rate, the
    program displays $1.50 as gratuity and $11.50 as total.
    Here is a sample run:
    Enter the subtotal and a gratuity rate: 10 15
    The gratuity is &1.50 and total is $11.50
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble()/100;

        System.out.printf("The gratuity is $%.2f and the total is $%.2f",
                subtotal*gratuityRate, subtotal + (subtotal*gratuityRate));

    }
}

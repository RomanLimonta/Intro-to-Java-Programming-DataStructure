package ch_02;

import java.util.Scanner;

public class Exercise02_22 {

    /*
    (Financial application: monetary units) Rewrite listing 2.10, ComputeChange.java, to fix the possible loss of
    accuracy when converting a double value to an int value, Enter the input as an integer whose last two digits
    represent the cents. For example, the input 1156 represent 11 dollars and 56 cents.
    * */

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in integer, for example 1156 for 11 dollars and 56 cents: ");

        //int amount = input.nextInt()/100;
        int remainingAmount = input.nextInt();
        int amountDollar = remainingAmount /100;
        int amountCents = remainingAmount%100;

        // Find the number of one dollar
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        System.out.println("Your total amount " + amountDollar + "."+ amountCents + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickles + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}

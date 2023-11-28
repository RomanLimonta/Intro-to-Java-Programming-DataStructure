package ch_03;

import java.util.Scanner;

public class Exercise03_07 {
    /*
    * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.java, to display the nonzero
    * denominations only, using singular words for single units such as 1 dollar and 1 penny, and plural words for more
    * than one unit such as 2 dollars and 3 pennies.*/

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

        String dollarAmount = (numberOfDollars>1)?"dollars":"dollar";
        System.out.println(" " + numberOfDollars + " " + dollarAmount);

        String quarterAmount = (numberOfQuarters>1)?"quarters":"quarter";
        System.out.println(" " + numberOfQuarters + " " + quarterAmount);

        String dimesAmount = (numberOfDimes>1)?"dimes":"dime";
        System.out.println(" " + numberOfDimes + " " + dimesAmount);

        // can only be 1 nickel. Two nickels is a dime.
        System.out.println(" " + numberOfNickles + " nickel");

        String penniesAmount = (numberOfPennies>1)?"pennies":"penny";
        System.out.println(" " + numberOfPennies + " " + penniesAmount);

        input.close();
    }
}

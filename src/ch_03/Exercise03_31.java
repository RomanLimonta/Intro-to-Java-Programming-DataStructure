package ch_03;

/*
* (Financials: currency exchange) Write a program that prompts the user to enter the exchange rate from currency in
* U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
* from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to
* Chinese RMB or U.S. dollars, respectively.
*
* Here are the sample runs:
* Enter the exchange rate from dollars to RMB 6.81
* Enter 0 to convert dollars to RMB or Enter 1 to convert RMB to dollars: 0
* Enter the dollar amount: 100
* $100.00 is 681.00 yuan
*
*  Enter the exchange rate from dollars to RMB 6.81
 * Enter 0 to convert dollars to RMB or Enter 1 to convert RMB to dollars: 1
 * Enter the dollar amount: 10000
 * 10000.00 yuan is $1468.00
* */

import java.util.Scanner;

public class Exercise03_31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = scanner.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB or Enter 1 to convert RMB to dollars: ");
        int userInput = scanner.nextInt();

        if (userInput == 0) {
            System.out.println("Enter the dollar amount: ");
            double amount = scanner.nextDouble();
            System.out.printf("$%.2f  converted to RMB is %.2f yuan", amount, amount*exchangeRate);
        } else if (userInput == 1) {
            System.out.println("Enter the yuan amount: ");
            double amount = scanner.nextDouble();
            System.out.printf(amount + " yuan converted to dollars is $%.2f", amount/exchangeRate );
        } else {
            System.out.println("Incorrect input");
        }
        scanner.close();
    }

}

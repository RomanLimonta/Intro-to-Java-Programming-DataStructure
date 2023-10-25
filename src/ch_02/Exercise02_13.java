package ch_02;

import java.util.Scanner;

public class Exercise02_13 {
    /*
    (Financial application: compound value) Suppose you save $100 each month into a savings account with an annual
    interest rate of 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
    After the first month, the value in the account becomes:
                    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes:
                    (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes:
                    (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.

    Write a program that prompts the user to enter a monthly savings amount and displays the account value after the
    sixth month.

    Sample run:
    Enter the monthly saving amount: 100
    After the sixth month, the account value is 608.81
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        double accountValue1 = monthlySaving * (1 + 0.00417);
        double accountValue2 = (accountValue1 + monthlySaving) * (1 + 0.00417);
        double accountValue3 = (accountValue2 + monthlySaving) * (1 + 0.00417);
        double accountValue4 = (accountValue3 + monthlySaving) * (1 + 0.00417);
        double accountValue5 = (accountValue4 + monthlySaving) * (1 + 0.00417);
        double accountValue6 = (accountValue5 + monthlySaving) * (1 + 0.00417);

        System.out.printf("After the sixth month, the account value is %.2f",  accountValue6);
        input.close();
    }
}

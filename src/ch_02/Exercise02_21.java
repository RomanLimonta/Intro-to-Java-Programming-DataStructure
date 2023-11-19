package ch_02;

import java.util.Scanner;

public class Exercise02_21 {
    /*
    (Financial application: calculate future investment value) Write a program that reads in investment amount, annual
    interest rate, and number of years and display the future investment value using the following formula:

    futureInvestmentValue = InvestmentAmount x (1 + monthlyInterestRate)^(numberOfYears*12)

    For example, if your enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value
    is 1032.98

    Here is a sample run:
    Enter investment amount: 1000.56
    Enter annual interest rate in percentage: 4.25
    Enter number of years: 1
    Future value is $1043.92
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: (e.g 4.25)");
        double monthlyInterestRate = input.nextDouble()/1200;

        System.out.println("Enter number of years: ");
        double numberOfYears = input.nextInt();

        System.out.printf("Future value is %.2f",
                investmentAmount * (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }
}

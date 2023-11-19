package ch_02;

import java.util.Scanner;

public class Exercise02_20 {
    /*
    (Financial application: calculate interest) If you know the balance and the annual percentage interest rate, you
     can compute the interest on the next monthly payment using the following formula:
                interest = balance x (annualInterestRate/1200)
     Write a program that reads the balance and the annual percentage interest rate and displays the interest for the
     next month.

     Here is a sample run:
     Enter balance and interest rate (e.g. 3 for 3%): 1000 3.5
     The interest is 2.91667
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate(e.g. 3 for 3%): ");

        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        System.out.printf("The interest is %.2f ", balance * (annualInterestRate/1200));
    }
}

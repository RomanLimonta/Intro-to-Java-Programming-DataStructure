package ch_03;

import java.util.Scanner;

public class Exercise03_18 {

    /*
    (Cost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of shipping
    based on the weight of the package (in pounds).

                                       |3.5, if 0 < w < = 1
                                       |5.5, if 1 < w < = 3
                                c(w) = |
                                       |8.5, if 3 < w < = 10
                                       |10.5, if 10 < w < = 20

    Write a program that prompts the user to enter the weight of the package and displays the shipping cost. If the
    weight is negative or zero, display a message "invalid input." If the weight is greater than 20, display message
    "The package cannot be shipped."
    * */

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the weight of the package in pounds: ");

        double packageWeight = userInput.nextDouble();

        if (packageWeight <= 0) {
            System.out.println("Invalid Input");
        } else if (packageWeight > 20) {
            System.out.println("The package cannot be shipped");
        } else {
            if (packageWeight > 0 && packageWeight <= 1) {
                System.out.println("The shipping cost is $3.50");
            } else if (packageWeight > 1 && packageWeight <= 3) {
                System.out.println("The shipping cost is $5.50");
            } else if (packageWeight > 3 && packageWeight <= 10) {
                System.out.println("The shipping cost is $8.50");
            } else if (packageWeight > 10) {
                System.out.println("The shipping cost is $10.50");
            }
        }

    }//end of main method


}//end of Exercise03_18 class

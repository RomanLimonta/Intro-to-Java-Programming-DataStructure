package ch_02;

import java.util.Scanner;

public class Exercise02_23 {
    /*
    (Cost of driving) Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the
    car in miles per gallon, and the price per gallon then displays the cost of the trip.
    Here is a sample run:
    Enter the driving distance: 900.5
    Enter the miles per gallon: 25.5
    Enter price per gallon: 3.55
    The cost of driving is $125.36
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance:");
        double distance = input.nextDouble();

        System.out.println("Enter the miles per gallon:");
        double milesPerGallon = input.nextDouble();

        System.out.println("Enter price of gas per gallon:");
        double costOfGasPerGallon = input.nextDouble();

        System.out.printf("The cost of driving is %.2f", (distance/milesPerGallon) * costOfGasPerGallon);
        input.close();
    }
}

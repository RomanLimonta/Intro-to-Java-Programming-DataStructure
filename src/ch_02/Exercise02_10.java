package ch_02;

import java.util.Scanner;

public class Exercise02_10 {
    /*
    (Science: calculating energy) Write a program that calculates the energy needed to heat water from an initial
    temperature to a final temperature. Your program should prompt the user to enter the amount of water in kilograms
    and the initial and final temperature of the water. The formula to compute the energy is

    Q = M * (finalTemperature - initialTemperature) * 4184

    where M is the weight of water in kilograms, initial and final temperatures are in degrees Celsius, and energy Q
    is measured in joules.
    Here is a sample run:

     Enter the amount of water in kilograms: 55.5
     Enter the initial temperature: 3.5
     Enter the final temperature: 10.5
     The energy needed is 1625484.0
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();
        System.out.println("Enter the initial Temperature in Celsius: ");
        double initialTemp = input.nextDouble();
        System.out.println("Enter the final Temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        System.out.println("The energy needed is " + amountOfWater * (finalTemp - initialTemp) * 4184 + " joules.");
        input.close();
    }

}

package ch_02;

import java.util.Scanner;

public class Exercise02_14 {
    /*
    (Health application: computing BMI) Body Mass Index(BMI) is a measure of health on weight. It can calculated by
    taking your weight in kilograms and dividing, by the square of your height in meters. Write a program that prompts
    the user to enter a weight in pounds and height in inches and displays BMI. Note one pound is 0.45359237 kilograms
    and one inch is 0.0254 meters.
    Here is a sample run:
    Enter weight in pounds: 95.5
    Enter height in inches: 50
    BMI is 26.8573
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.printf("BMI is %.2f", (weight * 0.45359237)/Math.pow(height * 0.0254, 2));
        input.close();
    }
}

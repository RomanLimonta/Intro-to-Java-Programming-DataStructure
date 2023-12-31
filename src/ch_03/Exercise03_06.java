package ch_03;

import java.util.Scanner;

public class Exercise03_06 {
    /*
     * (Health application: BMI) Revising Listing 3.4 ComputeAndInterpretBMI.java, to let user enter weight, feet, inches.
     *  For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
     * Here is a sample run:
     *
     * Enter weight in pounds: 140
     * Enter feet: 5
     * Enter Inches: 10
     * BMI is 20.087702275404553
     * Normal
     * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}
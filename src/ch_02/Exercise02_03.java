package ch_02;

import java.util.Scanner;

public class Exercise02_03 {
    /*
    (Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the
    results. One foot is 0.305 meters.
    Here is a sample run:
    Enter a value for feet: 16.5
    ->16.5 feet is 5.0325 meters
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        feetToMetersConverter(input.nextDouble());
        input.close();
    }
    public static void feetToMetersConverter(double feet){
        System.out.println(feet + " feet is " + (feet * 0.305) + " meters.");
    }
}

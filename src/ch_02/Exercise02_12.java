package ch_02;

import java.util.Scanner;

public class Exercise02_12 {
    /*
    (Physics:finding runway length) Given an airplane's acceleration (a) and take-off speed (v), you can compute the
    minimum runway length needed for an airplane to take off using the following formula:
                  v^2
    length =    -------
                  2a
    Write a program that prompts the user to enter (v) in meters/second (m/s) and the acceleration (a) in
    meters/seconds squared (m/s^2), then displays the minimum runway length.

    Sample run:
    Enter speed and acceleration: 60 3.5
    The minimum runway length for this airplane is 514.286
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration separated by a space: e.g.[60 3.5] ");

        System.out.printf("The minimum runway length for this airplane is %.3f",
                (Math.pow(input.nextDouble(),2)/(2 * input.nextDouble()) ));
    }
}

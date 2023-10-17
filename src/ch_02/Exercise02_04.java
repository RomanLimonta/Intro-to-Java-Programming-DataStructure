package ch_02;

import java.util.Scanner;

public class Exercise02_04 {
    /*
    (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user
    to enter a number in pounds, converts it to kilograms, and display the results. One pound is 0.454 kilogram.
    Here is a sample run:
    Enter a number in pounds: 55.5
    55.5 pounds is 25.197 kilograms.
    * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double userInput = input.nextDouble();
        System.out.println(userInput + " pounds is " + userInput*0.454 + " kilograms");
    }

    
}

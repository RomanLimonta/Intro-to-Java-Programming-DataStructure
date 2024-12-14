package ch_03;

import java.util.Scanner;

public class Exercise03_20 {

    /*(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to compute the wind-chill temperature.
    The formula is valid for temperatures in the range between -58F and 41F and wind speed greater than or equal to 2.
    Write a program that prompts the user to enter a temperature and a wind speed. The program displays the wind-chill
    temperature if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind
    speed is valid.
    * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58f and 41f: ");
        double temp = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        String invalidTempText = (temp>41)? " is invalid temperature because its above 41.":
                " is invalid temperature because it below -51.";

        if(temp < -15 || temp > 41){
            System.out.println(temp + invalidTempText);
        }
        if(windSpeed < 2){
            System.out.println(windSpeed + " is invalid wind speed because its above 2.");
        }
        if(windSpeed >= 2 && temp > -15 && temp < 41){
            System.out.println("The wind chill index is " +
                    (35.74 + (0.6215 * temp) - 35.75 * Math.pow(windSpeed, 0.16) +0.4275 * temp * Math.pow(windSpeed, 0.16)));
            input.close();
        }

    }
}

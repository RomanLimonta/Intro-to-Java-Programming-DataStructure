package ch_02;

import java.util.Scanner;

public class Exercise02_17 {
    /*
    (Science: wind chill temperature) How cold is it outside? The temperature alone is not enough to provide the answer.
    Other factors including wind speed, relative humidity, and sunshine play important roles in determining in coldness
    outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the
    coldness using temperature and wind speed. The formula is

                            T(wc) = 35.74 + 0.6215t(a) - 35.75v^(0.16) + 0.4275t(a)v^(0.16)

    Where t(a) is the outside measured in degrees Fahrenheit, v is the speed measured in miles per hour, and t(wc) is
    the wind-chill temperature. The formula cannot be used for wind speeds below 2mph or temperatures below -58 degree F
    or above 41degree F.
    Write a program that prompts the user to enter a temperature between -58F and 41F and a wind speed greater than or
    equal to 2 then displays the wind-chill temperature. Use Math.pow(a, b) to compute v^(0.16).
    Here is a sample run:
    Enter the temperature in Fahrenheit between -58f and 41f: 5.3
    Enter the wind speed (>=2) in miles per hour: 6
    the wind chill index is -5.56707
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58f and 41f: ");
        double temp = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        System.out.println("The wind chill index is " +
                (35.74 + (0.6215 * temp) - 35.75 * Math.pow(windSpeed, 0.16) +0.4275 * temp * Math.pow(windSpeed, 0.16)));
        input.close();

    }

}

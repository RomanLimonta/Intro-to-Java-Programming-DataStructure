package ch_02;

import java.util.Scanner;

public class Exercise02_01 {
    /*
    (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console,
    then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
    Fahrenheit = (9 / 5) * celsius + 32
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        convertCelsiusToFahrenheit(input.nextDouble());
    }

    public static void convertCelsiusToFahrenheit(double celsius){
        System.out.println(celsius + " Celsius is " + ((1.8 * celsius)+32) + " Fahrenheit" );
    }
}

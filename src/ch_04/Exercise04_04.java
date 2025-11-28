package ch_04;

import java.util.Scanner;

/*
* (Geometry: area of a hexagon) The area of a hexagon can be computed using the following formula
* (s is the length of a side):
*
*                           Area =  6 * s^2 / 4 * tan(pie/6)
*
* Write a program that prompts the user  to enter the side of a hexagon and displays its area.
* Here is a sample run:
*
* Enter the side: 5.5
* The area of the hexagon is 78.59
* */
public class Exercise04_04 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of a hexagon:");

        double side = scanner.nextDouble();
        double hexagonArea = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6) );

        System.out.printf("The are of the hexagon is %.2f", hexagonArea);
    }
}

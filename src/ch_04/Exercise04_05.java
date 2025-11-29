package ch_04;

/*
* (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all sides are the same length
* and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for computing
* the area of a regular polygon is
*
*                   Area n * s^2 / 4 * tan(pi/n)
*
* Here s is the length of a side. Write a program that prompts the user to enter the number of sides and their length of
* a regular polygon and display its area.
*
* Here is a sample run:
*
* Enter the number of sides: 5
* Enter the sides length : 6.5
* The area of the polygon is 72.69017017488385
* */

import java.util.Scanner;

public class Exercise04_05 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        double polygonSides = scanner.nextDouble();

        System.out.println("Enter the sides length: ");
        double polygonSidesLength = scanner.nextDouble();

        double polygonArea = (polygonSides * (Math.pow(polygonSidesLength, 2))) / (4 * Math.tan(Math.PI/polygonSides));

        System.out.println( "The area of the polygon is " +  polygonArea);

        scanner.close();
    }
}

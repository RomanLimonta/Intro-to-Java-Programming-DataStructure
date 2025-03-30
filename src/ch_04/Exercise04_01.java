package ch_04;

/*
* (Geometry: area of a pentagon) Write a prompts the user to enter the length from the center of a pentagon to a vertex
* and computes the area of the pentagon.
* The formula for computing the area of pentagon is
*
*                       5 x s^2
*               AREA = -----------
*                      4 x tan(pi/5)
*
* where s is the length of a side. The side can be computed using the formula
*                            pi
*                 s - 2r sin----
*                             5
* where r is the length from the center of the pentagon to the vertex. Round up two digits after the decimal point.
* Here is sample run:
*
* Enter the length from the center to a vertex: 5.5
* The area of the pentagon is 71.92*/

import java.util.Scanner;

public class Exercise04_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");

        scanner.close();
    }
}

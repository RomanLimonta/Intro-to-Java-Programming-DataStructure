package ch_02;

import java.util.Scanner;

public class Exercise02_16 {
    /*
    (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and displays its
    area. The formula for computing the area of a hexagon is

            3 * SqRt(3)
    area = ----------- s^2
                2
    Where s is the length of a side
    Here is a sample run:
    Enter the length of the side: 5.5
    the area of the hexagon is 78.5918
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side: ");

        System.out.printf
                ("The area of the hexagon is %.2f", ( (3 * Math.pow(3,0.5)) / 2 ) * Math.pow(input.nextDouble(), 2) );

        input.close();
    }
}

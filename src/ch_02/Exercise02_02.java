package ch_02;

import java.util.Scanner;

public class Exercise02_02 {
     /*
    (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and computes
     the area and volume using the following formulas:
     area = radius * radius * pi
     volume = area * length

     Here is a sample run:
     Enter the radius and length of a cylinder: 5.5 12
     The area is 95.0331
     The volume is 1140.4
     **/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder separated by a space: ");
        cylinderAreaAndVolumeCalculator(input.nextDouble(), input.nextDouble());
        input.close();

    }

    public static void cylinderAreaAndVolumeCalculator(double radius, double length) {
        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The area is %.2f: \n", area);
        System.out.printf("The volume is %.2f: \n", volume);
    }
}

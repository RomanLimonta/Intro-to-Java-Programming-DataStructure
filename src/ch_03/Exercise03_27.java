package ch_03;

/*
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane shown below. The right-angle
 * point is placed at (0, 0), and the other two points are placed at (200, 0) and (0, 100). Write a program that
 * prompts the user to enter a point with x- and y-coordinates and determines whether the point is inside the
 * triangle.
 * Here is a sample run:
 * Enter a point's x- and y-coordinates: 100.5 25.5
 * The point is in the triangle
 * */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise03_27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a point's x- and y-coordinate: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

       // Area A = [ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2

        //(0,0) (200-0) (0-100)
        //x1 y1  x2 y2   x3 y3

        //double areaOfTr

    }

}

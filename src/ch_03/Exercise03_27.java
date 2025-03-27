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

import java.util.Scanner;

public class Exercise03_27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a point's x- and y-coordinate: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();



        //Given points:  x1 y1   x2  y2    x3 y3
        //              A(0,0) B(200, 0) C(0, 100)


        //Area of triangle = [ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2
        double areaOfTriangle = Math.abs(((0*(0 - 100)) + (200*(100 - 0)) + (0*(0- 0)))) /2.0;
        //System.out.println("The area of the triangle is " + areaOfTriangle);

        //area of sub triangle using given point.
        //Triangle PAB (where A = (0, 0), B = (200, 0), and P = (x, y))
        //Triangle PBC (where B = (200, 0), C = (0, 100), and P = (x, y))
        //Triangle PCA (where C = (0, 100), A = (0, 0), and P = (x, y))
        double subTriangleArea1 = Math.abs((0*(0-y) + 200*(y-0) + x*(0-0))) /2.0;
        //System.out.println("The subTriangle area is " + subTriangleArea1);
        double subTriangleArea2 = Math.abs(200*(100-y) + 0*(y-0) + x*(0-100)) /2.0;
        //System.out.println("The subTriangle area is " + subTriangleArea2);
        double subTriangleArea3 = Math.abs(0*(0 - y) + 0*(y-100) + x*(100-0)) /2.0;
        //System.out.println("The subTriangle area is " + subTriangleArea3);

        //System.out.println("the sum of the sub triangles is " + (subTriangleArea1 + subTriangleArea2 + subTriangleArea3));

        //compare if sum of sub triangles equals the triangle.
        if ((subTriangleArea1 + subTriangleArea2 + subTriangleArea3) == areaOfTriangle) {
            System.out.println("The point (" + x +", " + y  +") is within the triangle.");
        } else {
            System.out.println("The point (" + x +", " + y + ") is not within the triangle.");
        }
    }

}

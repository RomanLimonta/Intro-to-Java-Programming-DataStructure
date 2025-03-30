package ch_03;
/*
* (Geometry: point on a line segment) Exercise03_32 shows how to test whether a point is on an unbounded line. Revise
* Exercise03_32 to test whether a point is on a line segment. Write a program that prompts the user to enter the three
* points for p0, p1, and p2 and display whether p2 is on the line segment from p0 to p1.
* Here are some sample runs:
*
* Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
* (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
*
* Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
* (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)*/

import java.util.Scanner;

public class Exercise03_34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double tolerance = 1e-10;

        if((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0) == 0 &&
                Math.min(x0, x1)<=x2 && Math.max(x0, x1)>=x2 &&
                Math.min(y0, y1)<=y2 && Math.max(y0, y1)>=y2)
        {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");
        }

        scanner.close();
    }
}

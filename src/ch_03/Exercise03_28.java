package ch_03;

/*
* (Geometry: two rectangles) Write a program that prompts the user to enter the center x-, y- coordinates, width, and
* height of two rectangles and determine whether the second rectangle is inside the first or overlaps with the first.
* Test your program to cover all cases.
*
* Here are the sample runs:
*
* Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
* Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
* r2 is inside r1
*
* Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
* Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
* r2 overlaps r1
*
* Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
* Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
* r2 is inside r1
* */

import java.util.Scanner;

public class Exercise03_28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println
                ("Enter r1's center x-, y-coordinates, width, and height: (four numbers separated by space): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();
        double x1min = x1 - width1/2;
        double y1min = y1 - height1/2;
        double x1max = x1 + width1/ 2;
        double y1max = y1 + height1/2;

        System.out.println
                ("Enter r2's center x-, y-coordinates, width, and height: (four numbers separated by space): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();
        double x2min = x2 - width2/2;
        double y2min = y2 - height2/2;
        double x2max = x2 + width2/2;
        double y2max = y2 + height2/2;

        scanner.close();

        if (x1min <= x2min && x1max >= x2max && y1min <= y2min && y1max >= y2max){
            System.out.println("r2 is within r1");
        } else if (x1max >= x2min && x2max >= x1min && y1max >= y2min && y2max >= y1min){
            System.out.println("r2 overlaps with r1");
        } else {
            System.out.println("r2 does not overlaps with r1");
        }

    }
}

package ch_03;
/*
*(Geometry: two circles) Write a program that prompt the user to enter the center coordinate and radii of two circles
* and determines whether the second circle is inside the first or overlaps with the first.
* (Hint: Circle2 is inside Circle1 if the distance between the two centers <= r1 - r2 and overlap Circle1 if the
* distance between the two center <= r1 + r2. Test your program to cover all cases.)
* Here are the sample runs:
* Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
* Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
* circle2 is inside circle1
* */

import java.util.Scanner;

public class Exercise03_29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double c1x = scanner.nextDouble();
        double c1y = scanner.nextDouble();
        double c1r = scanner.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double c2x = scanner.nextDouble();
        double c2y = scanner.nextDouble();
        double c2r = scanner.nextDouble();

        scanner.close();

        //If you have two points, (x1, y1) and (x2, y2), the distance (d) between them is:
        //d = √((x2 - x1)² + (y2 - y1)²)

        double distanceBetweenC1andC2 = Math.pow(c2x - c1x, 2) + Math.pow(c2y - c1y, 2);
        if( Math.sqrt(distanceBetweenC1andC2) <= c1r - c2r){
            System.out.println("circle2 is inside circle1");
        } else  if( Math.sqrt(distanceBetweenC1andC2) <= c1r + c2r){
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}

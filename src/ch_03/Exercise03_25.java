package ch_03;

import java.util.Scanner;

public class Exercise03_25 {

    /*
    * (Geometry: intersecting point) Two points on line 1 are given (x1,y1) and (x2,y2) and on line 2 (x3, y3) and
    * (x4, y4), as shown in figure 3.8a and b.
    *
    * The intersecting point of the two lines can be found by solving the following linear equations:
    *
    * (y1-y2)X - (x1-x2)y = (y1-y2)x1 - (x1-x2)y1
    * (y3-y4)x - (x3-x4)y = (y3-y4)x3 - (x3-x4)y3
    *
    * This linear equation can be solved using Cramer's rule (see Programming Exercise 3.3). If the equation has no
    * solution, the two lines are parallel (see figure 3.8c) Write a program that prompts the user to enter four points
    * and display the intersecting point.
    * Here is a sample run:
    * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1 4.0 2.0 -1.0 -2.0 [enter]
    * The intersecting point is at (2.8889, 1.1111)
    * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0 [enter]
    * The two lines are parallel.
    *
    *
    *                   Cramer rule from exercise01_13
    *                ax + by = e        ed - ef          af - ec
    *                               x = -------      y = -------
    *                cx + dy = f        ad - bc          ad - bc
    *
    *          If ad-bc is 0, report that "the equation has no solution".
    * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();


        double a = y1 - y2;
        double b = (x1 - x2);
        double c = y3 - y4;
        double d = (x3 - x4);
        double e = (a * x1) - (b * y1);
        double f = (c * x3) - (d * y3);

        if (a*d - b*c == 0){
            System.out.println("The equation has no solution");
        } else {
            double x =( ((e*d)-(b*f)) / ((a*d)-(b*c)) );
            //double y =( ((a*f)-(e*c)) / ((a*d)-(b*c)) );
            double y = (((a * f) - (e * c)) / ((a * d) - (b * c))); // This line was the only needed change
            System.out.printf("The intersection points is at: ( %.4f, %.4f )", x, y );
        }
    }

}

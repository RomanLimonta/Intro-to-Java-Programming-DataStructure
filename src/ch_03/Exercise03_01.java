package ch_03;

import java.util.Scanner;

public class Exercise03_01 {
    /*
    (Algebra: solve quadratic equations) The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using
    the following formula:

                    -b + sqRoot[ b^2 -4ac ]          -b - sqRoot[ b^2 -4ac ]
               r1 = -----------------------       r2 -----------------------
                            2a                                  2a
    b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots.
    If it is zero, the equation has one root. If it is negative, the equation has no real roots.
    Write a program that prompts the user to enter values for a, b, and c and display the results based on the
    discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
    Otherwise, display "The equation has no real roots"

    Note: you can use Math.pow(x, 0.5) to compute sqRoot[x].
    Here is a sample runs

    enter a,b,c: 1.0 3 1
    the equation has two roots -0.381966 and -2.61803

    enter a,b,c: 1 2.0 1
    the equation has one root -1.0

    enter a,b,c: 1 2 3
    The equation has no real roots.
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminantValue = (Math.pow(b, 2) - 4*a*c);

        double rootOne = (-b + Math.pow(discriminantValue,.5))/2*a;
        double rootTwo = (-b - Math.pow(discriminantValue,.5))/2*a;

        if(discriminantValue > 0) {
            System.out.println("The equation has two roots: " + rootOne + " and " + rootTwo);
        } else if (discriminantValue == 0) {
            System.out.println("The equation has one root: " + rootOne);
        } else {
            System.out.println("The equation has no real roots");
        }
        input.close();
    }
}

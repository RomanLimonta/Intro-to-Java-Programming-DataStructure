package ch_03;

import java.util.Scanner;

public class Exercise03_23 {
    /*
    * (Geometry: point in a rectangle?) Write a program that prompts the user to enter a point (x,y) and checks whether
    * the point is within the rectangle centered at (0,0) with width 10 and height 5. For example (2,2) is inside the
    * rectangle and (6,4) is outside the rectangle, as shown in figure 3.7b (Hint: A point is in the rectangle if its
    * horizontal distance to (0,0) is less than or equal to 10.0/2 and its vertical distance (0,0) is less than or equal
    * to 5.0/2. Test your program to cover all cases.
    *
    * Here are two samples
    * Enter a point with two coordinates: -4.9 2.49
    * Point (-4.9, 2.49) is in the rectangle
    *
    * Enter a point with two coordinates: -5.1 -2.4
    * Point (-5.1, -2.4) is in the rectangle  */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                A Rectangle is centered at (0, 0) with width 10 and height 5.
                Enter one point (x y) seperated by a space.
                The program will determine if the point is within the Rectangle: (e.g. 5 8)""");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(x<= 10.0/2 && x>-5 && y<=5.0/2 && y>-2.49){
            System.out.println("Point (" + x + ", " + y + ") is in the Rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the Rectangle");
    }
}
}

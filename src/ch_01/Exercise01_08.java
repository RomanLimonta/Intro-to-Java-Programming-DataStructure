package ch_01;

public class Exercise01_08 {
    /*
    (Area and perimeter of circle) Write a program that displays the area and perimeter of a circle that has a radius
    of 5.5 using the following formula:

                                            perimeter = 2 x radius x pi
                                            area = radius x radius x pi

    **/

    public static void main(String[] args) {

        //double perimeter = 2 * 5.5 * Math.PI;
        //double area = 5.5 * 5.5 * Math.PI;

        //System.out.println
        // ("A circle with a 5.5 radius has a perimeter of " + perimeter + " and an area of " + area + ".");

        System.out.println
                ("A circle with a 5.5 radius has a perimeter of " + (2 * 5.5 * Math.PI) + ".");
        System.out.println
                ("A circle with a 5.5 radius has an area of " + (5.5 * 5.5 * Math.PI) + ".");
    }
}

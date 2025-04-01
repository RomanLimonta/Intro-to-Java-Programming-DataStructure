package ch_04;


import java.util.Scanner;

/*
* (Geometry: great circles distance) The great circle distance is the distance between two points on the surface of a
* sphere. Let (x1, y1) and (x2, y2) be the geographic latitude and longitude of two points. The great circle distance
* between the two points can be computed using the following formula:
*
* d=radius x arccos( sin(x1) x sin(x2) + cos(x1) x cos(x2) x cos(y1-y2) )
*
* Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees and
* display its great circle distance. The average radius of the earth is 6,371km. Note you need to convert the degrees
* into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and
* longitude degrees is the formula are for north and west. Use negative to indicate south and east degrees.
* Here is a sample run:
*
* Enter point 1 (latitude and longitude) in degrees: 39.55 -116.25
* Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
* The distance between the two points is 1069.79183231593 km
* */
public class Exercise04_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");

        double lat1 = Math.toRadians(scanner.nextDouble());
        double lon1 = Math.toRadians(scanner.nextDouble());

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = Math.toRadians(scanner.nextDouble());
        double lon2 = Math.toRadians(scanner.nextDouble());

        double distance = 6371 * Math.acos( Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        System.out.println("The distance between the two points is " + distance + " km");
        scanner.close();
    }
}

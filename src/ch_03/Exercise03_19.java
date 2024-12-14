package ch_03;

import java.util.Scanner;

public class Exercise03_19 {

    /*
     * (Compute the perimeter of a triangle) Write a program  that reads three edges for a triangle and computes the
     * perimeter if the input is valid. Otherwise, display that the input is invalid. The input is invalid if the sum
     * of every pair of edges is greater than the remaining edge.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 edges of a triangle seperated by space: ");
        double edgeOne = input.nextDouble();
        double edgeTwo = input.nextDouble();
        double edgeThree = input.nextDouble();

        input.close();

        if(edgeOne+edgeTwo>edgeThree && edgeTwo+edgeThree>edgeOne && edgeThree+edgeOne>edgeTwo){
            System.out.println("The perimeter of the triangle is: " + (edgeOne+ edgeTwo + edgeThree));
        } else {
            System.out.println("The input is invalid");
        }
    }
}

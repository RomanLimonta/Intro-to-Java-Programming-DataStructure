package ch_02;

import java.util.Scanner;

public class Exercise02_09 {
    /*
    (Physics: acceleration) Average acceleration is defined as the change of velocity divided bt the time taken to make
     the change, as given bt the following formula:

              v1 - v0
        a =   ------
                 t

     Write a program that prompts the user to enter the starting velocity (v0) in meters/seconds, the ending
     velocity (v1) in meters/second, and the time span (t) in seconds, then display the average acceleration.
     Here is a sample run:
     Enter v0, v1, and t: 5.5 50.9 4.5
     The average acceleration is 10.0889
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting velocity(v0) and the end velocity (v1) and the time span: ");
        double startVelocity = input.nextDouble();
        double endVelocity = input.nextDouble();
        double timeSpan = input.nextDouble();

        System.out.println("The average acceleration is " + (endVelocity - startVelocity)/ timeSpan);
    }
}

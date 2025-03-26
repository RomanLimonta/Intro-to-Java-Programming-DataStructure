package ch_03;

    /*
    * 3.26 (Use the &&, || and ^ operators) Write a program that prompts the user to enter an integer and determines
    * whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6,
    * but not both.
    * Here is a sample run of this program:
    * Enter an integer: 10
    * Is 10 divisible by 5 and 6? false
    * Is 10 divisible by 5 or 6? true
    * Is 10 divisible by 5 or 6, but not both? true
    */

import java.util.Scanner;

public class Exercise03_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println
                ("Is " + number + " divisible by 5 and 6?" + (number % 5 == 0 && number % 6 == 0?" true":" false"));
        System.out.println
                ("Is " + number + " divisible by 5 or 6?" + (number % 5 == 0 || number % 6 == 0?" true":" false"));
        System.out.println
                ("Is " + number + " divisible by 5 or 6?" +
                        ((number % 5 == 0 && number % 6 != 0)||(number % 6 == 0 && number % 5 != 0)?" true":" false"));

        scanner.close();
    }
}

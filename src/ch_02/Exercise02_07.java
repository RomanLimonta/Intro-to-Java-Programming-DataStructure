package ch_02;

import java.util.Scanner;

public class Exercise02_07 {
    /*(Find the number of years) Write a program that prompts the user to enter the minutes(e.g. 1 billion), and
    and display the maximum number of years and remaining days for the minutes. For simplicity, assume that a year
    has 365 days.
    Here is a sample run:
    Enter the number of minutes: 1000000000
    1000000000 minutes is approximately 1902 years and 214 days.
    * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        minutesToYearsAndDays(input.nextInt());
        input.close();

    }

    public static void minutesToYearsAndDays(int minutes) {
        int numberOfYears = minutes/525600;  //365 * 1440 = 525600 minutes in 365 days
        int numberOfDays = (minutes%525600)/1440;  //1440 minutes in a day
        System.out.println
                (minutes + " is approximately " + numberOfYears + " years and " + numberOfDays + " days.");
    }
}

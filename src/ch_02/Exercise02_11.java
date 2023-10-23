package ch_02;

import java.util.Scanner;

public class Exercise02_11 {
    /*
    (Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and
    display the population after the number of years. Use the hint in Programming Exercise 1.11 for this program.
    Here is a sample run of the program:
    Enter the number of years:
    the population in 5 years is 325932969
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        int secondsInYear = 365 * 24 * 60 * 60;
        double numberOfNewBirthPerYear = secondsInYear/7.0;
        double numberOfDeathPerYear = secondsInYear/13.0;
        double numberOfNewImmigrantPerYear = secondsInYear/45.0;

        int numberOfCurrentPopulation = 312032486;

        System.out.println("The current population  : " + numberOfCurrentPopulation);
        for (int i = 1; i<=numberOfYears; i++) {
            numberOfCurrentPopulation +=
                    (int) (numberOfNewBirthPerYear - numberOfDeathPerYear + numberOfNewImmigrantPerYear);
        }
        System.out.println("The population in " + numberOfYears + " year: " + numberOfCurrentPopulation);

    }

}

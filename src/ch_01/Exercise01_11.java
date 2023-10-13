package ch_01;

public class Exercise01_11 {
    /*(Population projection) The U.S. Census Bureau projects population based on the following assumptions.

    #One birth every 7 seconds
    #One death every 13 seconds
    #One new immigrant every 45 seconds

    Write a program to display the population for each of the next five years. Assume that the current population is
    312,032,486, and one year has 365 days.
    * */
    public static void main(String[] args) {

        int secondsInYear = (365 * 24) * 60 * 60;

        double numberOfNewBirthPerYear = secondsInYear/7.0;
        double numberOfDeathPerYear = secondsInYear/13.0;
        double numberOfNewImmigrantPerYear = secondsInYear/45.0;

        double populationGrowthPerYear = Math.round(numberOfNewBirthPerYear + numberOfNewImmigrantPerYear - numberOfDeathPerYear);

        int numberOfCurrentPopulation = 312032486;

        System.out.println("The current population  : " + numberOfCurrentPopulation);
        for (int i = 1; i<=5; i++) {
            System.out.println("The population in " + i + " year: " + Math.round(numberOfCurrentPopulation + populationGrowthPerYear));
            numberOfCurrentPopulation+= (int) populationGrowthPerYear;
        }
    }
}

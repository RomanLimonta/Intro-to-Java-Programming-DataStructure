package ch_01;

public class Exercise01_10 {
    /*
    (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program
    that displays the average speed in miles per hour. (Note 1 mile is equal to 1.6 kilometers.)
    * */

    public static void main(String[] args) {

        double kilometersToMiles = 14/1.6; // 14 kilometers = 8.75 miles
        double minutesPerMile = 45.5/kilometersToMiles; // 1 mile in 5.2 minutes
        double milesPerHour = 60/minutesPerMile; // 11.54mph

        System.out.printf("The runner average speed is 14 kilometers in 45 minutes " +
                        "and 30 seconds or %.2f miles per hour\n", milesPerHour);
    }
}

package ch_01;

public class Exercise01_12 {

    /*
    (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a
    program that displays the average speed in kilometers per hour.(Note 1 mile is equal to 1.6 kilometers)
    *  */

    public static void main(String[] args) {
        double totalRunTimeInMinutes = ((100.0 * 60) + 35)/60;
        double totalDistanceInKilometers = 24 * 1.6;
        double KilometersPerHour = 60*totalDistanceInKilometers/totalRunTimeInMinutes;

        System.out.println(KilometersPerHour);

    }
}


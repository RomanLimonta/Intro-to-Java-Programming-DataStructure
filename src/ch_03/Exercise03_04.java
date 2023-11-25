package ch_03;

import java.util.Random;

public class Exercise03_04 {
    /*
     * (Random Month) Write a program that randomly generates an integer between 1 and 12 and displays the English month
     * names January, February,...., December for the numbers 1, 2, ...., 12, accordingly;
     * */

    public static void main(String[] args) {
        Random number = new Random();
        //generates a random integer

        int monthNumber = number.nextInt(12)+1;
        //nextInt(12) bounds the random integer between 0 and 11. Adding +1 to adjust integer to 1 to 12

        String month = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Error";
        };

        System.out.println(month);
    }
}

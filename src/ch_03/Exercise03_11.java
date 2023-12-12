package ch_03;

import java.util.Scanner;

public class Exercise03_11 {
    /*
    * (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays
    * the number of days in the month. For example, if the user entered month 2 and year 2012, the program should display
    * that February 2012 has 29 days. If the user entered month 3 and year 2015, the program should display that March
    * 2015 has 31 days.
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to a month and a year: Ex. 3 2015 ");
        int monthNumber = scanner.nextInt();
        int year = scanner.nextInt();

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

        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8
                || monthNumber == 10 || monthNumber == 12) {
            System.out.println(month + " " + year + " has 31 days");
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11){
            System.out.println(month + " " + year + " has 30 days");
        } else {
            int days = isLeapYear(year) ? 29:28;
            System.out.println(month + " " + year + " has " + days );
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year%4 == 0) {
            if (year%100 == 0){
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

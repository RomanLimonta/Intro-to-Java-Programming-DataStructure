package ch_03;

import java.util.Scanner;

public class Exercise03_21 {
    /*
    * (Science: day of the week) Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day
    * week. The formula is
    *
    *       |      26(m+1)        k     j        |
       h =  | q + -------- + k + --- + --- +  5j | %7
    *       |        10           4     4        |
    *
    * h is the day od the week(0: Saturday 1:Sunday 2:Monday 3:Tuesday 4:Wednesday 5:Thursday 6:Friday)
    * q is the day of the month
    * m is the month (3:March April:4 May:5 June:6 July:7 August:8 September:9 October:10 November:11 December:12
    * 13:January 14:February)
    * j is year/100
    * k is the year of the century(year % 100)
    *
    * Note all divisions in this exercise perform an integer division. Write a program that prompts the user to enter a
    * year, month, and day of the month, and displays the name of the day of the week.
    *
    * Here are some sample runs:
    * Enter Year: (e.g., 2o12) 2015
    * Enter month: 1-12: 1
    * Enter the day of the month: 1-31: 25
    * Day of the week is Sunday
    *
    * * Here are some sample runs:
    * Enter Year: (e.g., 2o12) 2011
    * Enter month: 1-12: 5
    * Enter the day of the month: 1-31: 12
    * Day of the week is Saturday
    *
    * (Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13
    * and 2 to 14 for the month and change the year to the previous year. for example, if the user enters 1 for m and
    * 2015 for year, m will be 13 and year will be 2014 used in the formula.)
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: (e.g 2012): ");
        int year = input.nextInt();

        System.out.print("Enter Month 1-12: ");
        int month = input.nextInt();

        if(month==1){month = 13;
        year -= 1;}

        if (month==2){month = 14;
        year -= 1;}

        System.out.print("Enter Day of the month: 1-31 ");
        int day = input.nextInt();

        int h = (day + ((26*(month+1))/10) + ((year%100)) + ((year%100)/4) + ((year/100)/4) + (5*(year/100))) % 7;

        String dayofTheweek = switch (h) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "";
        };


        System.out.print("Enter Day of the week: " + dayofTheweek);
    }

}

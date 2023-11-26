package ch_03;

import java.util.Scanner;

public class Exercise03_05 {
    /*
    * (Find future dates) Write a program that prompts the user to enter an integer for today's day of the week
    * (Sunday is 0, Monday is 1, ..., and Saturday is 6), Also prompt the user to enter the number of days after today
    * for a future day and display the future day of the week.
    * Here is a sample run:
    *
    * Enter today's day: 1
    * Enter the number of days elapsed since today: 3
    * Today is Monday and the future day is Thursday.
    *
    * Enter today's day: 0
    * Enter the number of days elapsed since today: 31
    * Today is Sunday and the future day is Wednesday.
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Sunday = 0
                Monday = 1
                Tuesday = 2
                Wednesday = 3
                Thursday = 4
                Friday = 5
                Saturday = 6
                Enter today's day:""");
        int todayDay = input.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int elapsedDay = input.nextInt();

        if( elapsedDay < 7) {
            elapsedDay = elapsedDay - todayDay;
        } else {
            elapsedDay = elapsedDay%7 - todayDay;
        }

        System.out.println("Today is " + dayOfTheWeek(todayDay) + " and the future day is " + dayOfTheWeek(elapsedDay));
        input.close();
    }
    public static String dayOfTheWeek(int number) {
        return switch (number){
            case 0 -> "Sunday";
            case 1-> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Error";
        };
    }
}

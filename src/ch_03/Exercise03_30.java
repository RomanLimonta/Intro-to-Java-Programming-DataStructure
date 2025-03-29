package ch_03;

import java.util.Scanner;

/*
* (Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
* Here is a sample run:
* Enter the time zone offset to GMT: -5(standard) -4(daylight savings)
* The current time is 4:50:34 AM
* */
public class Exercise03_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The time zone offset to GMT: ");
        timeConverterFromGMT(input.nextLong());
        input.close();

    }

    public static void timeConverterFromGMT(long offset) {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinute = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHour = (totalHours+offset)%24;

        System.out.println("The current time is " +
                (currentHour >=13? currentHour-12 :currentHour) + ":" +
                (currentMinute<10? "0"+currentMinute: currentMinute) + ":" +
                (currentSeconds<10?"0"+currentSeconds:currentSeconds) +
                (currentHour >=13? " PM" : " AM"));
    }
}

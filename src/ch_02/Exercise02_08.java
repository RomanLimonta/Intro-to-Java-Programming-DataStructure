package ch_02;

import java.util.Scanner;

public class Exercise02_08 {
    /*
    (Current time)Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. Revise the
    program, so it prompts te user to enter the time zone offset to GMT and displays the time in the specified time zone.
    Here is a sample run:
    Enter the time zone offset to GMT: -5
    The current time is 4:50:34
    * */

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
        long currentHour = (totalHours+offset)%24 ;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSeconds);
    }
}

package ch_02;

public class Exercise02_18 {
    /*
    (Print a table) Write a program that displays the following table. Cast Floating-point numbers into integers.

                        a     b    pow(a, b)
                        1     2     1
                        2     3     8
                        3     4     81
                        4     5     1024
                        5     6     15625
    * */

    public static void main(String[] args) {


        System.out.printf(
                """
                        a     b     pow(a, b)
                        1     2     %.0f
                        2     3     %.0f
                        3     4     %.0f
                        4     5     %.0f
                        5     6     %.0f""",
                Math.pow(1 ,2), Math.pow(2,3), Math.pow(3,4), Math.pow(4,5),Math.pow(5,6));


    }
}

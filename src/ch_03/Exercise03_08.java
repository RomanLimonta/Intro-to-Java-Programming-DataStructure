package ch_03;

import java.util.Scanner;

public class Exercise03_08 {
    /*
    (Sort three integers) Write a program that prompts the user to enter three integers and display the integers in
    non-decreasing order
    * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: e.g. 8 5 2");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 & num1 > num3){
            if(num2 > num3) {
                System.out.println(num1 +" "+ num2 +" "+ num3);
            } else {
                System.out.println(num1 +" "+ num3 +" "+ num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3){
                System.out.println(num2 +" "+ num1 +" "+ num3);
            } else {
                System.out.println(num2 +" "+ num3 +" "+ num1);
            }
        } else {
            if (num1 > num2){
                System.out.println(num3 +" "+ num1 +" "+ num2);
            }else {
                System.out.println(num3 +" "+ num2 +" "+ num1);
            }
        }

        input.close();
    }
}

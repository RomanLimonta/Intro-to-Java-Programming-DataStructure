package ch_03;

import java.util.Random;
import java.util.Scanner;

public class Exercise03_14 {
    /*
    (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or
    tails. The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the
    user to enter a guess, and reports whether the guess is correct or incorrect.
    * */

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumberBetweenZeroOrOne = random.nextInt(2);
        Scanner userInput = new Scanner(System.in);

        System.out.println("The program flipped a coin. Guess Head or Tail:\nfor Head: enter 0\nfor Tail: enter 1");

        if (userInput.nextInt()==randomNumberBetweenZeroOrOne){
            System.out.println("The coin lands on " + (randomNumberBetweenZeroOrOne==0 ? "Head":"Tail" ));
            System.out.println("You won!");
        } else {
            System.out.println("The coin lands on " + (randomNumberBetweenZeroOrOne==0 ? "Head":"Tail" ));
            System.out.println("You lose!");
        }

    }
}

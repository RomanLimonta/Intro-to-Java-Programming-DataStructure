package ch_03;

import java.util.Random;
import java.util.Scanner;

public class Exercise03_17 {
    /**
     * (Game:scissor, rock, paper) Write a program that plays the popular scissor-rock-paper game. (scissors can cut a
     * paper, a rock can knock scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or
     * 2 representing scissor, rock, paper. The program prompts the user to enter a number 0, 1, 2 and displays a
     * message indicating whether the user or the computer wins, loses, or draws. Here are sample runs:
     *
     * Scissor (0), Rock (1), Paper (2): 1
     * The computer is scissor. You are rock. You won.
     *
     * Scissor (0), Rock (1), Paper (2): 2
     * The computer is paper. You are paper too. It is a draw.
     **/

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        String[] selection = {"Scissor", "Rock", "Paper"};

        Random random = new Random();
        String programChoice = selection[random.nextInt(3)];

        System.out.println("Select Rock, Paper, or Scissor!\nRock [1], Paper[2], Scissor [0]:");
        String userChoice = selection[input.nextInt()];

        if (userChoice.equals("Rock")){

            if (programChoice.equals("Rock")) {
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". It is a draw");
            } else if (programChoice.equals("Paper")){
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". You lose.");
            } else {
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". You won.");
            }

        } else if (userChoice.equals("Paper")){

            if (programChoice.equals("Rock")) {
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". You won.");
            } else if (programChoice.equals("Paper")){
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". It is a draw");
            } else {
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". You lose.");
            }

        } else {

            if (programChoice.equals("Rock")) {
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". You lose.");
            } else if (programChoice.equals("Paper")){
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". You won.");
            } else {
                System.out.println("The computer is " + programChoice + ". You are " + userChoice + ". It is a draw");
            }
        }

        input.close();
    }
}

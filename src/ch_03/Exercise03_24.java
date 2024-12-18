package ch_03;

public class Exercise03_24 {

    /*
    * (Game:pick a card) Write a program that simulates picking a card from a deck of 52 cards. Your program should
    * display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades)
    * of the card. Here is a sample run of the program:
    *
    * The card you picked is Jack of Hearts*/


    public static void main(String[] args) {

        String[] cardRank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String [] cardSuit = {"Clubs", "Diamonds", "Hearts", "Spades"};

        //int card = (int)(Math.random() * 52);

        System.out.println("The card you picked is " + cardRank[(int) (Math.random() * 13)]
                + " of " + cardSuit[(int) (Math.random() * 4)] + ".");

    }
}

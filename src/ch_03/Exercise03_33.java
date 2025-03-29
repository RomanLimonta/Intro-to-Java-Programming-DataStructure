package ch_03;

import java.util.Scanner;

/*
* (Financial: compare costs) Suppose you shop for rice in two different packages. You would like to write a program
* to compare the cost. The program prompts the user to enter the weight and price of each package and display the one
* with the better price.
* Here is a sample run:
*
* Enter weight and price for package 1: 50 24.59
* Enter weight and price for package 2: 25 11.99
* Package 2 has a better price
*
* Enter weight and price for package 1: 50 25
* Enter weight and price for package 2: 25 12.80
* Two packages have the same price
**/
public class Exercise03_33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1:");
        double pk1Weight = scanner.nextDouble();
        double pk1Price = scanner.nextDouble();
        double pk1PricePerWeight = pk1Weight/pk1Price;

        System.out.println("Enter weight and price for package 2:");
        double pk2Weight = scanner.nextDouble();
        double pk2Price = scanner.nextDouble();
        double pk2PricePerWeight = pk2Weight/pk2Price;

        System.out.println(pk1PricePerWeight);
        System.out.println(pk2PricePerWeight);

        if(pk1PricePerWeight < pk2PricePerWeight) {
            System.out.println("Package 1 has a better price");
        }
        if(pk1PricePerWeight > pk2PricePerWeight) {
            System.out.println("Package 2 has a better price");
        }
        if(pk1PricePerWeight == pk2PricePerWeight) {
            System.out.println("Two packages have the same price");
        }



        scanner.close();

    }
}

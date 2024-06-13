package ch_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise22_05 {

/*  Write an O(n) program that prompts the user to enter a sequence of integers ending with 0 and finds the longest
    subsequence with the same number. Here is a sample run of the program:

    Sample Run 1
    Enter a series of numbers ending with 0:
        2 4 4 8 8 8 8 2 4 4 0
    The longest same number sequence starts at index 3 with 4 values of 8

    Sample Run 2
    Enter a series of numbers ending with 0:
        34 4 5 4 3 5 5 3 2 0
    The longest same number sequence starts at index 5 with 2 values of 5
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series of numbers ending with 0: ");

        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();

        while (input.hasNextInt()) {
            int temp = input.nextInt();
            if (temp == 0) {
                break;
            }
            arrayOfNumbers.add(temp);
        }

        input.close();

        int consecutiveNumber = arrayOfNumbers.getFirst();
        int countOfConsecutiveNumber = 1;
        int startOfIndexOfConsecutiveNumber = 0;

        int tempConsecutiveNumber;
        int tempCountOfConsecutiveNumber;
        int tempStartOfIndexOfConsecutiveNumber;


        for (int i = 1; i < arrayOfNumbers.size(); i++) {

            if (consecutiveNumber == arrayOfNumbers.get(i) && arrayOfNumbers.get(i) != 0) {

                do {
                    countOfConsecutiveNumber++;
                    i++;
                } while (consecutiveNumber == arrayOfNumbers.get(i) && i < 10);

            } else {

                if (arrayOfNumbers.get(i) == 0) break;
                tempConsecutiveNumber = arrayOfNumbers.get(i);
                tempStartOfIndexOfConsecutiveNumber = i;

                if (i < arrayOfNumbers.size() - 1 && tempConsecutiveNumber == arrayOfNumbers.get(i + 1) && arrayOfNumbers.get(i + 1) != 0) {
                    tempCountOfConsecutiveNumber = 0;

                    do {
                        tempCountOfConsecutiveNumber++;
                        if (tempCountOfConsecutiveNumber > countOfConsecutiveNumber) {
                            consecutiveNumber = tempConsecutiveNumber;
                            countOfConsecutiveNumber = tempCountOfConsecutiveNumber;
                            startOfIndexOfConsecutiveNumber = tempStartOfIndexOfConsecutiveNumber;
                            break;
                        }
                        i++;
                    } while (tempConsecutiveNumber == arrayOfNumbers.get(i) && i < arrayOfNumbers.size() - 1);
                }
            }
        }
        System.out.println("The longest same number sequence starts at index " + startOfIndexOfConsecutiveNumber
                + " with " + countOfConsecutiveNumber + " values of " + consecutiveNumber);
    }

}

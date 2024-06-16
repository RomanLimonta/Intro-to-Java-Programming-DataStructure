package ch_03;

public class Exercise03_16 {
    /**
     * (Random point) Write a program that displays a random coordinate in a rectangle. The rectangle is centered at
     * (0,0) with a width 100 and height of 200.
     **/

    public static void main(String[] args) {
        int minXAxis = -50;
        int maxXAxis = 50;

        int minYAxis = -100;
        int maxYAxis = 100;

        // Generate random number between 100 and 999 (inclusive)
        int xPoint = (int) (Math.random() * ((maxXAxis - minXAxis) + 1)) + minXAxis;
        int yPoint = (int) (Math.random() * ((maxYAxis - minYAxis) + 1)) + minYAxis;
        System.out.println("X = " + xPoint + ", Y = " + yPoint);

//        double x = Math.random() * 100 - 50;
//        double y = Math.random() * 200 - 100;
//
//        System.out.println(x + ", " + y);
    }
}

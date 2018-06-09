/**
 * Write a program that simulates a dice roll by picking a random number from 1-6 and then picking a second random number from 1-6. Add the two values together, and display the total.
 */
package programmingByDoing.randomNumbers;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random r = new Random();
        int d1 = 1 + r.nextInt(6);
        int d2 = 1 + r.nextInt(6);
        System.out.println("HERE COMES THE DICE!");
        System.out.println("Roll #1: " + d1);
        System.out.println("Roll #2: " + d2);
        System.out.println("Dice totals: " + (d1 + d2));
    }
}
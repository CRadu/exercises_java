/**
 * Write a program that picks a random number from 1-100. The user keeps guessing as long as their guess is wrong, and
 * they've guessed less than 7 times. If their guess is higher than the number, say "Too high." If their guess is lower
 * than the number, say "Too low." When they get it right, the game stops. Or, if they hit seven guesses, the game stops
 * even if they never got it right.
 * <p>
 * This means your while loop will have a compound condition using &&.
 */
package programmingByDoing.whileLoops;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1-100.  Try to guess it.");
        int num = 1 + r.nextInt(100);
        int guess = scanner.nextInt();
        int count = 1;
        while (guess != num && count < 7) {
            if (guess != num) {
                if (guess < num) {
                    System.out.println("Try number: " + count + " Sorry, you are too low.");
                } else if (guess > num) {
                    System.out.println("Try number: " + count + " Sorry, you are too high.");
                }
                count++;
                System.out.print("Guess again! ");
                guess = scanner.nextInt();
            }
        }
        if (count == 7) {
            System.out.println("Wasted all 7 chances! The number is: " + num);
        } else {
            System.out.println("You guessed it!  What are the odds?!? " + num);
        }
    }
}
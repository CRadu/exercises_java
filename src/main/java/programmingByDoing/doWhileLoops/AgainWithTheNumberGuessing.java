/**
 * Filename: AgainWithTheNumberGuessing.java
 * Again with the Number-Guessing
 * Redo the Number-Guessing with a Counter assignment using a do-while loop instead of a while loop. Otherwise it should do exactly the same things (including the counter).
 * <p>
 * Make sure that it doesn't mess up if you guess it on the first try.
 */
package programmingByDoing.doWhileLoops;

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int snumber = 1 + r.nextInt(10);
        System.out.print("Guess the secret number(1-10): ");
        int guessnumber = scanner.nextInt();
        int count = 1;
        do {
            System.out.println("You have not guessed the random number. Try again!");
            guessnumber = scanner.nextInt();
            count++;
        } while (guessnumber != snumber);
        System.out.println("Cool guess! The random number is " + snumber + "! You guessed trying " + count + " times.");

    }
}
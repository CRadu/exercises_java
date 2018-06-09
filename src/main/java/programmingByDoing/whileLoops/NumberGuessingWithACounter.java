/**
 * Modify your previous number-guessing game so that they can guess until they get it right AND count the number of tries it takes them to guess it.
 */
package programmingByDoing.whileLoops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter {
    public static void main(String[] args) {
        Random r = new Random();
        int snumber = 1 + r.nextInt(10);
        int guessnumber;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the secret number(1-10): ");
        guessnumber = scanner.nextInt();
        while (guessnumber != snumber) {
            System.out.println("You have not guessed the random number. Try again!");
            guessnumber = scanner.nextInt();
            count++;
        }
        System.out.println("Cool guess! The random number is " + snumber + "! You guessed trying " + count + " times.");

    }
}
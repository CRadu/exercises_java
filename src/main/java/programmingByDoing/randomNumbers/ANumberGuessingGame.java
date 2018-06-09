/**
 * Modify your incredibly stupid number-guessing game to actually pick a random number from 1 to 10 and have the user try to guess that. Tell them if they get it right or wrong, and if they get it wrong, show them what the random number was.
 * <p>
 * They will still only get one try.
 */
package programmingByDoing.randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        int snumber = 1 + r.nextInt(10);
        int guessnumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the secret number: ");
        guessnumber = scanner.nextInt();
        if (guessnumber == snumber) {
            System.out.println("Congratulation, you have guessed the random number!");
        } else if (guessnumber != snumber) {
            System.out.println("You haven't guess! The random number is " + snumber + "!");
        }
    }
}
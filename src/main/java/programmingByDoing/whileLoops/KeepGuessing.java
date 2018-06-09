/**
 * Modify your previous number-guessing game so that they can guess until they get it right. That means it will keep
 * looping as long as the guess is different from the secret number. Use a while loop.¶
 */
package programmingByDoing.whileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Random r = new Random();
        int snumber = 1 + r.nextInt(10);
        int guessnumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("I have chosen a number between 1 and 10. Try to guess it! ");
        guessnumber = scanner.nextInt();
        while (guessnumber != snumber) {
            System.out.println("Your guess: " + guessnumber + "\n" +
                    "That is incorrect. Guess again.");
            guessnumber = scanner.nextInt();
        }
        System.out.println("Congratulations! You have guessed! The number is: " + snumber);
    }
}
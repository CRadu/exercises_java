/**
 * Write a program that plays an incredibly stupid number-guessing game. The user will get one try to guess the secret number. Tell them if they got it right or wrong, and if they got it wrong, display what the secret number was.
 * <p>
 * You must store the secret number in a variable, and use that variable throughout. The secret number itself must not appear in the	program at all, except in the one line where you store it into a variable.
 * <p>
 * I know it will be the same number every time the game is played.
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class TheWorstNumberGuessingGameEver {
    public static void main(String[] args) {
        int snumber = 23;
        int guessnumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the secret number: ");
        guessnumber = scanner.nextInt();
        if (guessnumber == snumber) {
            System.out.println("Congratulation, you have guessed the secret number, " + snumber + "!");
        } else if (guessnumber != snumber) {
            System.out.println("You haven't guess! The secret number is " + snumber + "!");
        }
    }

}
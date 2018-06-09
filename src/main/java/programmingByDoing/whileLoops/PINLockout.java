/**
 * Type in the following code, and get it to compile.
 * What You Should Do on Your Own
 * Assignments turned in without these things will receive no credit.
 * <p>
 * Change the code so that it locks them out after 4 tries instead of 3. Make sure to change the message at the bottom, too.
 * Move the "maximum tries" value into a variable, and use that variable everywhere instead of just the number.
 */
package programmingByDoing.whileLoops;

import java.util.Scanner;

public class PINLockout {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxTries = 4;
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;

        while (entry != pin && tries < maxTries) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }

        if (entry == pin)
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if (tries >= maxTries)
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }
}
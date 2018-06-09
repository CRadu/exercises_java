/**
 * Ask the user for two words and two numbers, and let the person at the keyboard type in some values, but don't bother storing their responses into any variables.
 * <p>
 * Again, there is no need to create any variables, except for the Scanner variable typically named keyboard.
 */

package programmingByDoing.keyboardInput;

import java.util.Scanner;

public class TheForgetfulMachine

{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstWord;
        String secondWord;
        int firstNo;
        int secondNo;

        System.out.print("Type a word ");
        firstWord = keyboard.next();

        System.out.print("Type another word ");
        secondWord = keyboard.next();

        System.out.print("Type a number ");
        firstNo = keyboard.nextInt();

        System.out.print("Type another number  ");
        secondNo = keyboard.nextInt();

        System.out.println("So you typed " + firstWord + ", " + secondWord + ", " + firstNo + ", " + "and " + secondNo);
    }
}
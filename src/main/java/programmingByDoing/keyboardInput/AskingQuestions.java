/**
 * Change the program so that it reads in the height in two parts. The first part should read in an int for the number of feet. Then read in a second int for the number of inches. Try to make the output look the same, though.
 */

package programmingByDoing.keyboardInput;

import java.util.Scanner;

public class AskingQuestions

{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        int feetHeight;
        int inchHeight;
        double weight;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("How tall are you in feet? ");
        feetHeight = keyboard.nextInt();

        System.out.print("How tall are you in inch? ");
        inchHeight = keyboard.nextInt();

        System.out.print("How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println("So you're " + age + " old, " + feetHeight + "feet " + inchHeight + "inches" + " tall and " + weight + " heavy.");
    }
}
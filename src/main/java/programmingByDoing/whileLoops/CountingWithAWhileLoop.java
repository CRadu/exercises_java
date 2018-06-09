/**
 * Type in the following code, and get it to compile. This assignment shows you how we can abuse a while loop to make something repeat an exact number of times.
 * What You Should Do on Your Own
 * Assignments turned in without these things will receive no credit.
 * <p>
 * What does n++ do? Remove it and see what happens. (Then put it back.)
 * Change the code so that the loop repeats ten times instead of five.
 * See if you can change the code so that the message still prints ten times, but the numbers in front count by tens, like so:
 * Change the code so that it asks the person how many times to display the message. Then, print it that many times. Still count by tens.
 */
package programmingByDoing.whileLoops;

import java.util.Scanner;

public class CountingWithAWhileLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.print("How many times do you want the message to be displayed? ");
        int nr = keyboard.nextInt();
        int n = 0;
        while (n < nr) {
            System.out.println((n + 1) + ". " + message);
            n++;
        }
    }
}

/**
 * As you saw in Counting with a While Loop, a while loop can be used to to make something happen an exact number of times.
 * <p>
 * However, this isn't our best choice. while loops are designed to keep going as long as something is true. But if we know in advance how many times we want to do something, Java has a special kind of loop designed just for making a variable change values: the for loop.
 * <p>
 * Type in the following code, and get it to compile. Then answer the questions down below.
 * for loops are best when we know in advance how many times we want to do something.
 * <p>
 * Do this ten times.
 * Do this five times.
 * Pick a random number, and do it that many times.
 * Take this list of items, and do it one time for each item in the list.
 * On the other hand, while loops are best for repeating as long as something is true:
 * <p>
 * Keep going as long as they haven't guessed it.
 * Keep going as long as you haven't got doubles.
 * Keep going as long as they keep typing in a negative number.
 * Keep going as long as they haven't typed in a zero.
 * <p>
 * What You Should Do on Your Own
 * Assignments turned in without these things will receive no credit.
 * <p>
 * What does n = n+1 do? Remove it and see what happens. (Then put it back.)
 * What does int n = 1 do? Remove it and see what happens. (Then put it back.)
 * Change the code so that the loop repeats ten times instead of five.
 * See if you can change the for loop so that the message starts at 2 and counts by twos, like so:
 */
package programmingByDoing.forLoops;

import java.util.Scanner;

public class CountingWithAForLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();

        for (int n = 2; n <= 10; n = n + 1) {
            System.out.println(n + ". " + message);
        }

    }
}

/**
 * In this program, you'll see how using a do-while loop might be better than a while loop.
 * What You Should Do on Your Own
 * Assignments turned in without these things will receive no credit.
 * <p>
 * The code as given does not compile. Notice that the while loop tests if again.equals("y"), but the variable again doesn't have a value at first. Give it a value so that the code will compile and the loop will run at least once.
 * Now that program is working, change the loop from a while loop to a do-while loop. Make sure it still works.
 * What happens if you delete what you added in step 1? Change the line back to just String again; Does the program still work? Why or why not? (Answer in a comment.)
 */
package programmingByDoing.doWhileLoops;

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        String again;
        do {
            int flip = rng.nextInt(2);
            String coin;

            if (flip == 1)
                coin = "HEADS";
            else
                coin = "TAILS";

            System.out.println("You flip a coin and it is... " + coin);

            System.out.print("Would you like to flip again (y/n)? ");
            again = keyboard.next();
        } while (again.equals("y"));
    }
}

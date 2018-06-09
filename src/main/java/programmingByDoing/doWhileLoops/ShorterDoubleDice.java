/**
 * Redo the Dice Doubles assignment (the dice program with a loop) so that it uses a do-while loop instead of a while loop. Otherwise it should behave exactly the same.
 * <p>
 * If you do this correctly, there should be less code in this version.
 */
package programmingByDoing.doWhileLoops;

import java.util.Random;

public class ShorterDoubleDice {
    public static void main(String[] args) {
        Random r = new Random();
        int d1 = 1 + r.nextInt(6);
        int d2 = 1 + r.nextInt(6);
        do {
            System.out.println("Rolling till we get doubles!");
            System.out.println("Roll #1: " + d1);
            System.out.println("Roll #2: " + d2);
            System.out.println("Total: " + (d1 + d2));
        } while (d1 != d2);
        System.out.println("We have doubles!");
        System.out.println("Roll #1: " + d1);
        System.out.println("Roll #2: " + d2);
        System.out.println("Total: " + (d1 + d2));
    }
}
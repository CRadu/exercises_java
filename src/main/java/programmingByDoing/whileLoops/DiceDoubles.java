/**
 * Modify your dice game from last time so that it keeps rolling until they get doubles (the same number on both dice).
 * <p>
 * Notice that since there's no user input, this will happen very quickly (all the rolls will happen one right after the other).
 */
package programmingByDoing.whileLoops;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random r = new Random();
        int d1 = 1 + r.nextInt(6);
        int d2 = 1 + r.nextInt(6);
        System.out.println("Rolling till we get doubles!");
        System.out.println("Roll #1: " + d1);
        System.out.println("Roll #2: " + d2);
        while (d1 != d2) {
            System.out.println("Rolling till we get doubles!");
            System.out.println("Roll #1: " + d1);
            System.out.println("Roll #2: " + d2);
            d1 = 1 + r.nextInt(6);
            d2 = 1 + r.nextInt(6);

        }
        System.out.println("We have doubles!");
        System.out.println("Roll #1: " + d1);
        System.out.println("Roll #2: " + d2);
    }
}
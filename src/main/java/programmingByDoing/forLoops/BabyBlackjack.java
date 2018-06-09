/**
 * Write a program that allows a human user to play a single hand of "blackjack" against a dealer.
 * <p>
 * Pick two values from 1-10 for the player. These are the player's "cards".
 * Pick two more values from 1-10 for the dealer.
 * Whoever has the highest total is the winner.
 * There is no betting, no busting, and no hitting. Save that for real blackjack.
 */
package programmingByDoing.forLoops;

import java.util.Random;

public class BabyBlackjack {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Baby Blackjack!");
        int n = 1 + r.nextInt(10);
        int m = 1 + r.nextInt(10);
        int ty = m+n;
        System.out.println("You drew " + n + " and " + m + ".");
        System.out.println("Your total is " + (n + m) + ".");
        int a = 1 + r.nextInt(10);
        int b = 1 + r.nextInt(10);
        int td = a+b;
        System.out.println("The dealer has " + a + " and " + b + ".");
        System.out.println("Dealer's total is " + (a + b) + ".");

        if (ty>td) {
            System.out.println("You win!");
        }else if(td>ty){
            System.out.println("Dealer wins!");
        }else {
            System.out.println("Equality!");
        }
    }
}
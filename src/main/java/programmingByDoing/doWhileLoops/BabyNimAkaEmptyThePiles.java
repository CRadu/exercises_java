/**
 * Write a program that starts with three "piles" of 3 counters each. Let the player choose piles and remove counters until all the piles are empty.
 * <p>
 * Start by placing counters (coins or toothpicks or something) into 3 piles.
 * The player picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
 * The player picks a new pile, then removes one or more counters from that pile. (It's okay to pick the same pile as before.)
 * Once all piles are empty, the game stops.
 * You do not need to check for errors like a wrong pile name, or if someone tries to take more counters from the pile than the pile has.
 */
package programmingByDoing.doWhileLoops;

import java.util.Scanner;

public class BabyNimAkaEmptyThePiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 3;
        int b = 3;
        int c = 3;
        String p;
        int nr;
        System.out.println("A = 3, B = 3, C = 3");
        do {
            System.out.print("Choose a pile: ");
            p = scanner.next();
            System.out.print("How many to remove from pile " + p + ": ");
            nr = scanner.nextInt();
            if (p.equals("a")) {
                a = a - nr;
                System.out.println("Pile A: " + a);
            } else if (p.equals("b")) {
                b = b - nr;
                System.out.println("Pile B: " + b);
            } else if (p.equals("c")) {
                c = c - nr;
                System.out.println("Pile C: " + c);
            }

        } while (a + b + c != 0);
        System.out.println("All piles are empty!");
    }
}
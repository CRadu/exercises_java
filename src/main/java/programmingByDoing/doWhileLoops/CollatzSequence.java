/**
 * Take any natural number n.
 * <p>
 * If n is even, divide it by 2 to get n / 2.
 * If n is odd, multiply it by 3 and add 1 to get 3n + 1.
 * Repeat the process indefinitely.
 * In 1937, Lothar Collatz proposed that no matter what number you begin with, the sequence eventually reaches 1. This is widely believed to be true, but has never been formally proved.
 * <p>
 * Write a program that inputs a number from the user, and then displays the Collatz Sequence starting from that number. Stop when you reach 1.
 * For +10 bonus points, also display the total number of steps in the sequence.
 * For +20 bonus points, display the largest value encounted in the sequence.
 * For +30 bonus points, do both.
 */
package programmingByDoing.doWhileLoops;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int nr = scanner.nextInt();
        int count = 0;
        int max = 0;
        while (nr != 1) {
            if (nr % 2 == 0) {
                nr = nr / 2;
                System.out.println("Even: " + nr);
                count++;
                if (max < nr) {
                    max = nr;
                }
            } else if (nr % 2 != 0) {
                nr = (3 * nr + 1);
                System.out.println("Odd: " + nr);
                count++;
                if (max < nr) {
                    max = nr;
                }
            }
        }
        System.out.println("Terminated after " + count + " steps. \nThe largest value was: " + max);
    }
}
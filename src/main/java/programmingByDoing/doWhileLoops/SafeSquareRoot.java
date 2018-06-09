/**
 * Write a program to take the square root of a number typed in by the user. Your program should use a loop to ensure that the number they typed in is positive. If the number is negative, you should print out some sort of warning and make them type it in again.
 * <p>
 * Note that it is possible to do this program with either a while loop or a do-while loop. (Though personally, I think this one is easier with a while loop.)
 * <p>
 * You can get the square root of a number n with Math.sqrt(n). Make sure you don't do this until the loop is done and you know for sure you've got a positive number.
 */
package programmingByDoing.doWhileLoops;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr;
        do {
            System.out.print("Enter a positive number for square root: ");
            nr = scanner.nextInt();
        } while (nr < 1);
        System.out.println("The square root of " + nr + " is: " + Math.sqrt(nr));
    }
}

/**
 * while (nr < 1) {
 * System.out.print("Enter a positive number for square root: ");
 * nr = scanner.nextInt();
 * }
 * System.out.println("The square root of " + nr + " is: " + Math.sqrt(nr));
 * }
 */
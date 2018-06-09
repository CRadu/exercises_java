/**
 * Write a program to allow the user to enter three integers. You must use do-while or while loops to enforce that these integers are in ascending order, though duplicate numbers are allowed.
 * <p>
 * Tell the user whether or not these integers would represent the sides of a right triangle.
 */
package programmingByDoing.doWhileLoops;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        do {
            System.out.println("Enter 3 ascending numbers: ");
            System.out.print("fist: ");
            a = scanner.nextInt();
            System.out.print("second: ");
            b = scanner.nextInt();
            if (b < a) {
                System.out.println("Enter ascending numbers after " + a);
                System.out.print("second: ");
                b = scanner.nextInt();
            }
            System.out.print("third: ");
            c = scanner.nextInt();
            if (c < b) {
                System.out.println("Enter a bigger number than " + b);
                System.out.print("third: ");
                c = scanner.nextInt();
            }
        } while (a > b && c > b);
        if (c > (Math.sqrt((a * a) + (b * b)))) {
            System.out.println("We have a right triangle!");
        } else {
            System.out.println("Your three sides are:" + a + ", " + b + ", " + c + ", " + "\n" +
                    "NO!  These sides do not make a right triangle!");
        }
    }
}

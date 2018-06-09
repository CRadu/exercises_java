/**
 * Write a program that gets three integers from the user. Count from the first number to the second number in increments of the third number. Use a for loop to do it.
 */
package programmingByDoing.forLoops;

import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to start from: ");
        int s = scanner.nextInt();
        System.out.print("Enter a number to count to: ");
        int n = scanner.nextInt();
        System.out.print("Enter a number to increments with: ");
        int t = scanner.nextInt();

        for (int i = s; i <= n; i = i + t) {
            System.out.print(i + " ");
        }
    }
}
/**
 * Write a program that gets several integers from the user. Sum up all the integers they give you. Stop looping when they enter a 0. Display the total at the end.
 * <p>
 * You must use a while loop.
 */
package programmingByDoing.whileLoops;

import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers you would like to add. (0 to exit): ");
        int input = scanner.nextInt();
        int sum = 0;
        while (input > 0) {
            sum = sum + input;
            System.out.print("Enter numbers you would like to add. (0 to exit): ");
            input = scanner.nextInt();
        }
        System.out.println("The sum is: " + sum);
    }
}
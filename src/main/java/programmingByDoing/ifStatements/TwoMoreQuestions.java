/**
 * Using if statements with compound conditions (like &&), make a guessing game of two questions similar to the Twenty Questions assignment.
 * <p>
 * However, this time you must accomplish it using if statements with compound conditions and you must not use else if or else or nested ifs.
 * <p>
 * Question 1: Does it belong inside or outside or both?
 * Question 2: Is it alive?
 * Again, here are some sample responses, for the non-creative among you.
 * <p>
 * inside	outside	both
 * alive	houseplant	bison	dog
 * not alive	shower curtain	billboard	cell phone
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args) {
        String answer1;
        String answer2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println("Question 1) Does it stay inside or outside or both? ");
        answer1 = scanner.next();
        System.out.println("Question 2) Is it a living thing?");
        answer2 = scanner.next();

        if (answer1.equals("inside") && answer2.equals("yes")) {
            System.out.println("houseplant");
        }
        if (answer1.equals("inside") && answer2.equals("no")) {
            System.out.println("shower curtain");
        }
        if (answer1.equals("outside") && answer2.equals("yes")) {
            System.out.println("bison");
        }
        if (answer1.equals("outside") && answer2.equals("no")) {
            System.out.println("billboard");
        }
        if (answer1.equals("both") && answer2.equals("yes")) {
            System.out.println("dog");
        }
        if (answer1.equals("both") && answer2.equals("no")) {
            System.out.println("cell phone");
        }
    }
}
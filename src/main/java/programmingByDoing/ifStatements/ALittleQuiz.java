/**
 * Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something. It must keep track of how many they get wrong, and print out a "score" at the end.
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        int total = 0;
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ready for the quiz?(y/n): ");
        String ready = scanner.next();
        if (ready.equals("n")) {
            System.out.println("Ok, next time!");
        } else {
            System.out.println("What is the capital of Alaska?");
            System.out.println(" 1)Melbourne");
            System.out.println(" 2)Anchorage");
            System.out.println(" 3)Juneau");
            System.out.print("> ");
            answer = scanner.nextInt();
            if (answer == 3) {
                System.out.println("That's right!");
                total = total + 1;
            } else {
                System.out.println("False!");
            }
            System.out.println("Can you store the value\"cat\" in a variable of type int?");
            System.out.println(" 1)yes");
            System.out.println(" 2)no");
            System.out.print("> ");
            answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("That's right!");
                total = total + 1;
            } else {
                System.out.println("False!");
            }
            System.out.println("What is the result of 9+6/3?");
            System.out.println(" 1)5");
            System.out.println(" 2)11");
            System.out.println(" 3)15/3");
            System.out.print("> ");
            answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("That's right!");
                total = total + 1;
            } else {
                System.out.println("False!");
            }
            System.out.println("Overall,you got " + total + " out of 3 correct!");
            System.out.println("Thanks for playing!");
        }

    }
}

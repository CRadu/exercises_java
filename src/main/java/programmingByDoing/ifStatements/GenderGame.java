/**
 * Filename: GenderGame.java
 * Gender Game
 * Make a program which displays an appropriate name for a person, using a combination of nested ifs and compound conditions. Ask the user for a gender, first name, last name and age.
 * <p>
 * If the person is female and 20 or over, ask if she is married. If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If the female is under 20, display her first and last name.
 * <p>
 * If the person is male and 20 or over, display "Mr." in front of his name. Otherwise, display his first and last name.
 * <p>
 * Note that asking a person if they are married should only be done if they are female and 20 or older, which means you will have a single if and else nested inside one of your if statements.
 * <p>
 * Also, did you know that with an if statement (or else), the curly braces are optional when there is only one statement inside?
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender;
        String firstName;
        String lastName;
        int age;
        String answer;

        System.out.print("Hello! What gender are you?(m/f) ");
        gender = scanner.next();
        System.out.print("What's your first name? ");
        firstName = scanner.next();
        System.out.print("What's your last name? ");
        lastName = scanner.next();

        if (gender.equals("m")) {
            System.out.print("How old are you? ");
            age = scanner.nextInt();
            if (age < 20) {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            } else if (age >= 20) {
                System.out.println("Then I shall call you Mr. " + firstName);
            }
        } else if (gender.equals("f")) {
            System.out.print("How old are you? ");
            age = scanner.nextInt();
            if (age >= 20) {
                System.out.println("Are you married?(y/n) ");
                answer = scanner.next();
                if (answer.equals("y")) {
                    System.out.println("Then I shall call you Mrs. " + firstName);

                } else if (answer.equals("n")) {
                    System.out.println("Then I shall call you Ms. " + firstName);
                }
            } else if (age < 20) {
                System.out.println("Then I shall call you " + firstName + " " + lastName);
            }
        }
    }
}
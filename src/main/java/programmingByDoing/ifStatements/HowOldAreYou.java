/**
 * Make a program which displays a different message depending on the age given. Here are the possible responses:
 * age is less than 16, say "You can't drive."
 * age is less than 18, say "You can't vote."
 * age is less than 25, say "You can't rent a car."
 * age is 25 or over, say "You can do anything that's legal."
 * Here's a sample run. Notice that a person who is under 16 will display three messages, one for being under 16, one for also being under 18, and one for also being under 25.
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        name = scanner.next();
        System.out.print("Who old are you, " + name + "? ");
        age = scanner.nextInt();

        if (age > 25) {
            System.out.println("You can do anything that's legal, " + name);
        } else if (age > 18 && age < 25) {
            System.out.println("You can't rent a car, " + name);
        } else if (age > 16 && age < 18) {
            System.out.println("You can't vote, " + name);
            System.out.println("You can't rent a car, " + name);
        } else {
            System.out.println("You can't drive, " + name);
            System.out.println("You can't vote, " + name);
            System.out.println("You can't rent a car, " + name);
        }
    }
}
/**
 * Using if statements, else if, and else statements, make a program which displays a different message depending on the age given.
 * age	message
 * less than 16	"You can't drive."
 * 16 to 17	"You can drive but not vote."
 * 18 to 24	"You can vote but not rent a car."
 * 25 or older	"You can do pretty much anything."
 * Note that unlike the original "How Old Are You" assignment, this program must only display exactly one message for a given age and not multiple messages.
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
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
            System.out.println("You can vote but not rent a car, " + name);
        } else if (age > 16 && age < 18) {
            System.out.println("You can drive but not vote, " + name);
        } else {
            System.out.println("You can't drive, " + name);
        }
    }
}
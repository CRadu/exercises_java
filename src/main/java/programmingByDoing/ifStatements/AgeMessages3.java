/**
 * Using if statements with compound conditions (like &&), make a program that displays a single message depending on the age given.
 * <p>
 * age	message
 * less than 16	"You can't drive."
 * 16 to 17	"You can drive but not vote."
 * 18 to 24	"You can vote but not rent a car."
 * 25 or older	"You can do pretty much anything."
 * This output of this assignment is identical to the "How Old Are You, Specifically" assignment. However, this time you must accomplish it using if statements with compound conditions and you must not use else if or else.
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class AgeMessages3 {
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
        }
        if (age > 18 && age < 25) {
            System.out.println("You can vote but not rent a car, " + name);
        }
        if (age > 16 && age < 18) {
            System.out.println("You can drive but not vote, " + name);
        }
        if (age < 16) {
            System.out.println("You can't drive, " + name);
        }
    }
}
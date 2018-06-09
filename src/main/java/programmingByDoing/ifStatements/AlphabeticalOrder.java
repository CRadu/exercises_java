/**
 * Make a program that asks for the last name of the user. Depending on their last name, make a statement about how long they have to wait during roll call. You need to use else ifs to make sure only one statement gets printed.
 * <p>
 * Once you understand how compareTo() works, this is a pretty straightforward assignment, much like How Old Are You, specifically, except that it uses Strings instead of ints and so you must use the compareTo() method.
 * <p>
 * name is "Carswell" or before: say "you don't have to wait long"
 * name is "Jones" or before: say "that's not bad"
 * name is "Smith" or before: say "looks like a bit of a wait"
 * name is "Young" or before: say "it's gonna be a while"
 * name is after "Young": say "not going anywhere for a while?"
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your last name? ");
        name = scanner.next();

        if (name.compareTo("Carswell") <= 0) {
            System.out.println("you don't have to wait long");
        } else if (name.compareTo("Jones") <= 0) {
            System.out.println("that's not bad");
        } else if (name.compareTo("Smith") <= 0) {
            System.out.println("looks like a bit of a wait");
        } else if (name.compareTo("Young") <= 0) {
            System.out.println("it's gonna be a while");
        } else if (name.compareTo("Young") > 0) {
            System.out.println("not going anywhere for a while?");
        }
    }
}
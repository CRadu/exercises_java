/**
 * Make another short "Choose Your Own Adventure" game. However, this time you need to use a loop so that they can freely move from room to room and back again.
 * <p>
 * There need to be at least six rooms or destinations, and at least two different ways for the game to end.
 * <p>
 * Files Needed
 * Adventure2.java - empty shell
 * Adventure2Example.java - tiny sample game
 */
package programmingByDoing.doWhileLoops;

import java.util.Scanner;

public class Adventure2 {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        do {
            System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                    "\"kitchen\"?");
            answer = scanner.next();
            if (answer.equals("upstairs")) {
                System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                        "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                        "to go?");
                answer = scanner.next();
                if (answer.equals("bedroom")) {
                    System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                            "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                            "like to open the door, or go back? (\"yes\" or \"no\")");
                    answer = scanner.next();
                    if (answer.equals("yes")) {
                        System.out.println("You fall an die.  Thanks for playing,\n" +
                                "I'm tired of making nested if statements.");
                    } else if (answer.equals("no")) {
                        System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                                "I'm tired of making nested if statements.");
                    } else if (answer.equals("back")) {
                        System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                                "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                                "to go?");
                        answer = scanner.next();
                    }
                }
                if (answer.equals("back")) {
                    System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                            "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                            "like to open the door, or go back? (\"yes\" or \"no\")");
                    answer = scanner.next();
                } else {
                    System.out.println("Not valid answer");
                }
            } else if (answer.equals("bathroom")) {
                System.out.println("You die... eventually.");

            } else if (answer.equals("kitchen")) {
                System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                        "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                        ", look in a \"cabinet\" or go back.");
                answer = scanner.next();
                if (answer.equals("refrigerator")) {
                    System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                            "Would you like to eat some of the food? (\"yes\" or \"no\")");
                    answer = scanner.next();
                    if (answer.equals("yes")) {
                        System.out.println("Great! You will die of toxiinfection!");

                    } else if (answer.equals("no")) {
                        System.out.println("You die of starvation... eventually.");
                    }
                } else if (answer.equals("cabinet")) {
                    System.out.println("You die... eventually.");
                } else if (answer.equals("back")) {
                    System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                            "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                            "or look in a \"cabinet\".");
                    answer = scanner.next();
                } else {
                    System.out.println("Not valid answer");
                }
            }
        } while (!answer.equals("yes"));
        System.out.println("You said yes, you are dead!");
    }
}
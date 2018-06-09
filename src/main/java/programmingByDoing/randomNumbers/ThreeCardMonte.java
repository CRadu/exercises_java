/**
 * This is the original "ball and cups" game where you try to find out which cup has the ball under it. You may play with
 * three cups and a ball, three cards (two jacks and an ace), or three doors and a car. Basically, randomly select a cup
 * to hide the "ball". Let the player guess which cup hides the ball. The player wins if they guess correctly.
 */
package programmingByDoing.randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int num = 1 + r.nextInt(3);
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.");
        System.out.println("Which one is the ace?\n" +
                "\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3");
        System.out.println(num);
        System.out.print("> ");
        int guess = scanner.nextInt();
        if (guess != num) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + num + ".");
        } else if (guess == num) {
            if (num == 1) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("\tAA  ##  ##\n" +
                        "\tAA  ##  ##\n" +
                        "\t1   2   3");

            } else if (num == 2) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("\t##  AA  ##\n" +
                        "\t##  AA  ##\n" +
                        "\t1   2   3");
            } else if (num == 3) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("\t##  ##  AA\n" +
                        "\t##  ##  AA\n" +
                        "\t1   2   3");
            }
        }
    }
}
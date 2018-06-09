/**
 * Nim is a strategy game between two players.
 * <p>
 * Start by placing counters (coins or toothpicks or something) into 3 piles.
 * Player #1 picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
 * Player #2 picks a pile, then removes one or more counters from that pile.
 * Player #1 plays again. (It's okay to choose a different pile this time.)
 * Whichever player is forced to take the last counter is the LOSER.
 * Write a program that allows two human players to play Nim against each other. The program should detect when the last counter has been taken and declare a winner.
 * <p>
 * At first, don't worry about detecting cheating. That is one of the bonus options.
 * For +30 bonus points, prevent the users from doing anything bad:
 * For +10 bonus points, make your program detect when there is only one counter left and declare the winner one turn earlier.
 * For +15 bonus points, visually display the counters in rows instead of just showing a number. You must use loops for this.
 * For +25 bonus points, visually display the counters in columns. You must use a loop for this.
 * <p>
 * This is quite difficult.
 */
package programmingByDoing.doWhileLoops;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 3;
        int b = 3;
        int c = 3;
        int p1 = 0;
        int p2 = 0;
        String p;
        int nr;
        System.out.println("A = 3, B = 3, C = 3");
        do {
            if ((a == 1 && b == 0 && c == 0) || (a == 0 && b == 1 && c == 0) || (a == 0 && b == 0 && c == 1)) {
                p2 = p2 + 1;
                break;
            }
            System.out.println("Player 1, your turn!");
            p1++;
            System.out.print("Choose a pile: ");
            p = scanner.next();
            System.out.print("How many to remove from pile " + p + ": ");
            nr = scanner.nextInt();
            input(p, nr, a, b, c);

            if (nr > 3) {
                System.out.print("Too much! The pile has less counters: ");
                nr = scanner.nextInt();
            } else if (nr <= 0) {
                System.out.println("You can't enter negative values! Try again: ");
                nr = scanner.nextInt();
            }
            if (p.equals("a")) {
                a = a - nr;
            } else if (p.equals("b")) {
                b = b - nr;
            } else if (p.equals("c")) {
                c = c - nr;
            }
            stars(a, b, c);
            if ((a == 1 && b == 0 && c == 0) || (a == 0 && b == 1 && c == 0) || (a == 0 && b == 0 && c == 1)) {
                p1 = p1 - 1;
                break;
            }
            if (p1 > p2) {
                System.out.println("Player 2, your turn!");
                p2++;
                System.out.print("Choose a pile: ");
                p = scanner.next();
                System.out.print("How many to remove from pile " + p + ": ");
                nr = scanner.nextInt();
                input(p, nr, a, b, c);

                if (nr > 3) {
                    System.out.print("Too much! The pile has less counters: ");
                    nr = scanner.nextInt();
                } else if (nr <= 0) {
                    System.out.println("You can't enter negative values! Try again: ");
                    nr = scanner.nextInt();
                }
                if (p.equals("a")) {
                    a = a - nr;
                } else if (p.equals("b")) {
                    b = b - nr;
                } else if (p.equals("c")) {
                    c = c - nr;
                }
                stars(a, b, c);

            }
        }
        while (a > 0 || b > 0 || c > 0);
        if (p1 > p2) {
            System.out.println("Player 1 you lose!");
        } else if (p2 >= p1) {
            System.out.println("Game over!Player 2 you lose!");
        }
    }

    public static void stars(int a, int b, int c) {
        String one = "*";
        String two = "**";
        String three = "***";
        if (a == 1) {
            System.out.println("A: " + one);
        } else if (a == 2) {
            System.out.println("A: " + two);
        } else if (a == 3) {
            System.out.println("A: " + three);
        }
        if (b == 1) {
            System.out.println("B: " + one);
        } else if (b == 2) {
            System.out.println("B: " + two);
        } else if (b == 3) {
            System.out.println("B: " + three);
        }
        if (c == 1) {
            System.out.println("C: " + one);
        } else if (c == 2) {
            System.out.println("C: " + two);
        } else if (c == 3) {
            System.out.println("C: " + three);
        }
    }

    public static void input(String pile, int num, int a, int b, int c) {

        if (pile.equals("a") && a == 0) {
            System.out.print("Pile " + pile + " is empty. Choose another pile: ");
        } else if (pile.equals("b") && b == 0) {
            System.out.print("Pile " + pile + " is empty. Choose another pile: ");
        } else if (pile.equals("c") && c == 0) {
            System.out.print("Pile " + pile + " is empty. Choose another pile: ");
        }
        if (num > 3) {
            System.out.print("Too much! The pile has less counters: ");
        } else if (num <= 0) {
            System.out.println("You can't enter negative values! Try again: ");
        }
    }
}
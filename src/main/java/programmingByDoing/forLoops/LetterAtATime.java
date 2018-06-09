/**
 * Did you know that using a loop, you can examine a String one letter at a time? The two key built-in String methods are length() and charAt().
 * <p>
 * length() returns an int representing the total number of characters in the String (including punctuation and whitespace). For example, if the variable str contains the String "hello", then str.length() will return 5.
 * charAt( int n ) returns the  nth character (char) in the String. The character positions are zero-based, so if the variable str contains the String "ligature", then str.charAt(0) will return 'l', and str.charAt(4) will return 't'.
 * Files Needed
 * LetterAtATime.java
 * What You Should Do on Your Own
 * Assignments turned in without these things will receive half credit or less.
 * <p>
 * The for loop is defined so that it repeats as long as  i < message.length(). Try changing it to <=. What happens? Answer in a comment, then change it back.
 * If a string variable contains the value "box", what is its length()? What is the position of the last character (the 'x')?
 * So, why does the for loop repeat as long as  i < message.length() instead of i <= message.length()?
 * Currently the code prints out the number of 'a's in the message. Change it so that it prints out the number of vowels (a A e E i I o O u U).
 */
package programmingByDoing.forLoops;

import java.util.Scanner;

public class LetterAtATime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");

        for (int i = 0; i < message.length(); i++) {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int a_count = 0;
        int e_count = 0;
        int i_count = 0;
        int o_count = 0;
        int u_count = 0;

        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (letter == 'a' || letter == 'A') {
                a_count++;
            }
            if (letter == 'e' || letter == 'E') {
                e_count++;
            }
            if (letter == 'i' || letter == 'I') {
                i_count++;
            }
            if (letter == 'o' || letter == 'O') {
                o_count++;
            }
            if (letter == 'u' || letter == 'U') {
                u_count++;
            }
        }
        System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'e' " + e_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'i' " + i_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'o' " + o_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'u' " + u_count + " times. Isn't that interesting?");
    }
}

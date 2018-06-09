/**
 * Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then display what their age would be five years from now. Then display what their age would be five years ago.
 */

package programmingByDoing.keyboardInput;

import java.util.Scanner;

public class AgeInFiveYears

{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Your name is: ");
        name = keyboard.next();

        System.out.print("Hello, "+name+ "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So "+name+ ", you will be "+(age +5) + " years old 5 years from now...");
    }
}
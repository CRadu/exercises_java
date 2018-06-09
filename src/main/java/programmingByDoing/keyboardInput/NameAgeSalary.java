/**
 * Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then display that. Finally, ask them for how much they make and display that. You should use the most appropriate data type for each variable.
 */

package programmingByDoing.keyboardInput;

import java.util.Scanner;

public class NameAgeSalary

{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.print("What's your name?  ");
        name = keyboard.next();
        System.out.print("Hello, " + name+ ", how old are you? ");
        age = keyboard.nextInt();
        System.out.print("You look pretty good for " +age+ " years!");
        System.out.println("Salary?  ");
        salary = keyboard.nextDouble();
        System.out.print("Nice income!");
    }
}
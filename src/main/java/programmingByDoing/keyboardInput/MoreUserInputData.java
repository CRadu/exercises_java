/**
 * Ask the user for several pieces of information, and display them on the screen afterward as a summary.
 * <p>
 * first name
 * last name
 * grade (classification)
 * student id number
 * login name
 * GPA (0.0 to 4.0)
 * You must use the most appropriate type for each variable and not just Strings for everything.
 */

package programmingByDoing.keyboardInput;

import java.util.Scanner;

public class MoreUserInputData

{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String lastName;
        Double grade;
        int studentIdNumber;
        String loginName;
        Double gpa;

        System.out.print("First Name: ");
        firstName = keyboard.next();

        System.out.print("Last Name: ");
        lastName = keyboard.next();

        System.out.print("Grade: ");
        grade = keyboard.nextDouble();

        System.out.print("Student number: ");
        studentIdNumber = keyboard.nextInt();

        System.out.print("Login Name: ");
        loginName = keyboard.next();

        System.out.print("GPA (0.0 to 4.0): ");
        gpa = keyboard.nextDouble();

        System.out.println("\n Your information: " + "\n Login: " + loginName + "\n ID: " + studentIdNumber + "\n Name: " + lastName + firstName + "\n GPA: " + gpa + "\n Grade: " + grade);
    }
}
/**
 * Make a simple numeric calculator. It should prompt the user for three numbers. Then add the numbers together and divide by 2. Display the result. Your program must support numbers with decimals and not just integers.
 */

package programmingByDoing.keyboardInput;

import java.util.Scanner;

public class ADumbCalculator

{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double firstNo;
        double secondNo;
        double thirdNo;
        System.out.println("We will calculate the average of 3 double numbers. Let's start!");
        System.out.print("Type a number: ");
        firstNo = keyboard.nextDouble();

        System.out.print("Type another number: ");
        secondNo = keyboard.nextDouble();

        System.out.print("Type the third number: ");
        thirdNo = keyboard.nextDouble();

        System.out.println("The average of the 3 numbers is: " + ((firstNo + secondNo+ thirdNo)/3));
    }
}
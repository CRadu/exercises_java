/**
 * Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently holds the championship belts for various weight categories on many different planets within our solar system. However, it is often difficult for him to recall what his "target weight" needs to be on earth in order to make the weight class on other planets.	Write a program to help him keep track of this.
 * <p>
 * It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on. It should then compute his weight on the destination planet based on the table below:
 * <p>
 * #	Planet	Relative gravity
 * 1	Venus	0.78
 * 2	Mars	0.39
 * 3	Jupiter	2.65
 * 4	Saturn	1.17
 * 5	Uranus	1.05
 * 6	Neptune	1.23
 * So, for example, if Julio weighs 128 lbs. on earth, then he would weigh just under 50 lbs. on Mars, since Mars' gravity is 0.39 times earth's gravity. (128 * 0.39 is 49.92)
 */
package programmingByDoing.ifStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SpaceBoxing {
    public static String planet(int pvalue) {
        String result = "";

        if (pvalue == 1) {
            result = "Venus";
        } else if (pvalue == 2) {
            result = "Mars";
        } else if (pvalue == 3) {
            result = "Jupiter";
        } else if (pvalue == 4) {
            result = "Saturn";
        } else if (pvalue == 5) {
            result = "Uranus";
        } else if (pvalue == 6) {
            result = "Neptune";
        } else {
            result = "error!";
        }
        return result;
    }

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight(kg's): ");
        double weight = scanner.nextDouble();
        System.out.print("Chose a planet: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("On " + planet(choice) + " your weight is: " + df2.format(weight * 0.78));
        } else if (choice == 2) {
            System.out.println("On " + planet(choice) + " your weight is:  " + df2.format(weight * 0.39));
        } else if (choice == 3) {
            System.out.println("On " + planet(choice) + " your weight is:  " + df2.format(weight * 2.65));
        } else if (choice == 4) {
            System.out.println("On " + planet(choice) + " your weight is:  " + df2.format(weight * 1.17));
        } else if (choice == 5) {
            System.out.println("On " + planet(choice) + " your weight is:  " + df2.format(weight * 1.05));
        } else if (choice == 6) {
            System.out.println("On " + planet(choice) + " your weight is:  " + df2.format(weight * 1.23));
        } else {
            System.out.println("Error! No planet chosen!");
        }
    }
}
/**
 * So far you have only worked with one type of loop: the while loop. But there is another type: the "do-while" loop.
 * <p>
 * The do-while loop works almost exactly like a while loop. In fact, most of the time they are equivalent. Examine the program below to see if you can figure out the tiny difference.
 * <p>
 * Files Needed
 * DoWhileSwimming.java
 */
package programmingByDoing.doWhileLoops;

import java.util.Scanner;

public class doWhileSwimming {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS ";

        double minimumTemperature = 79.0; // degrees Fahrenheit
        double currentTemperature;
        double savedTemperature;
        int swimTime;

        System.out.print("What is the current water temperature? ");
        currentTemperature = keyboard.nextDouble();
        savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

        System.out.println("\nOkay, so the current water temperature is " + currentTemperature + "F.");
        System.out.println(swimmer1 + " approaches the lake....");

        swimTime = 0;
        while (currentTemperature >= minimumTemperature) {
            System.out.print("\t" + swimmer1 + " swims for a bit.");
            swimTime++;
            System.out.println(" Swim time: " + swimTime + " min.");
            Thread.sleep(600); // pauses for 600 milliseconds
            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println("\tThe current water temperature is now " + currentTemperature + "F.");
        }

        System.out.println(swimmer1 + " stops swimming. Total swim time: " + swimTime + " min.");

        currentTemperature = savedTemperature; // restores original water temperature

        System.out.println("\nOkay, so the current water temperature is " + currentTemperature + "F.");
        System.out.println(swimmer2 + " approaches the lake....");

        swimTime = 0;
        do {
            System.out.print("\t" + swimmer2 + " swims for a bit.");
            swimTime++;
            System.out.println(" Swim time: " + swimTime + " min.");
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println("\tThe current water temperature is now " + currentTemperature + "F.");

        } while (currentTemperature >= minimumTemperature);

        System.out.println(swimmer2 + " stops swimming. Total swim time: " + swimTime + " min.");
    }
}

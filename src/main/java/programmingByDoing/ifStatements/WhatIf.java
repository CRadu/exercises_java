/**
 * Here is the next Java program you'll enter, which introduces you to the if statement. Type this in, make it run exactly right and then we'll see if your practice has paid off.
 */
package programmingByDoing.ifStatements;

public class WhatIf {
    public static void main(String[] args) {
        int people = 20;
        int cats = 10;
        int dogs = 15;

        if (people < cats) {
            System.out.println("Too many cats!  The world is doomed!");
        }

        if (people > cats) {
            System.out.println("Not many cats!  The world is saved!");
        }

        if (people < dogs) {
            System.out.println("The world is drooled on!");
        }

        if (people > dogs) {
            System.out.println("The world is dry!");
        }

        dogs += 5;

        if (people >= dogs) {
            System.out.println("People are greater than or equal to dogs.");
        }

        if (people <= dogs) {
            System.out.println("People are less than or equal to dogs.");
        }

        if (people == dogs) {
            System.out.println("People are dogs.");
        }
    }
}

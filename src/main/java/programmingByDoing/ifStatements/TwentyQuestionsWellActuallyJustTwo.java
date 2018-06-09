/**
 * Make a program which plays a simple game of 20 2 Questions. The first question should be "animal, vegetable, or mineral?" Then, the second question should be "is it bigger than a breadbox?" Then, display one of six possible responses, depending on their answers. You can choose what answers to give for each of the six possibilities.
 * Here's a suggestion:
 * size \ type	animal	vegetable	mineral
 * smaller than a breadbox	squirrel	carrot	paper clip
 * bigger than a breadbox	moose	watermelon	Camaro
 * You will use nested if statements to do this.
 */
package programmingByDoing.ifStatements;

import java.util.Scanner;

public class TwentyQuestionsWellActuallyJustTwo {
    public static void main(String[] args) {


        String answer1;
        String answer2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        answer1 = scanner.next();
        if (answer1.equals("animal")) {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            answer2 = scanner.next();
            if (answer2.equals("yes")) {
                System.out.println("My guess is that you are thinking of a moose.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else if (answer2.equals("no")) {
                System.out.println("My guess is that you are thinking of a squirrel.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else {
                System.out.println("Not an answer!");
            }
        } else if (answer1.equals("vegetable")) {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            answer2 = scanner.next();
            if (answer2.equals("yes")) {
                System.out.println("My guess is that you are thinking of a watermelon.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else if (answer2.equals("no")) {
                System.out.println("My guess is that you are thinking of a carrot.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else {
                System.out.println("Not an answer!");
            }
        } else if (answer1.equals("mineral")) {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            answer2 = scanner.next();
            if (answer2.equals("yes")) {
                System.out.println("My guess is that you are thinking of a Camaro.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else if (answer2.equals("no")) {
                System.out.println("My guess is that you are thinking of a paper clip.");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            } else {
                System.out.println("Not an answer!");
            }
        } else {
            System.out.println("Not an answer!");
        }
    }
}
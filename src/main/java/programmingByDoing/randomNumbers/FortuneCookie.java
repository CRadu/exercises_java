/**
 * Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.
 * <p>
 * For bonus points, also add randomly-chosen lotto numbers to the fortune. In Texas, the lotto chooses 6 numbers, each from 1-54.
 */
package programmingByDoing.randomNumbers;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {

        int fortune;
        Random r = new Random();
        System.out.println("What does the fortune random program say?");
        fortune = 1 + r.nextInt(6);
        if (fortune == 1) {
            System.out.println("Fortune cookie says: \"Stick with your wife.\" ");
        } else if (fortune == 2) {
            System.out.println("Fortune cookie says: \"You will win the lottery with 3,13,23,35,44,54.\" ");
        } else if (fortune == 3) {
            System.out.println("Fortune cookie says: \"You wil find somethig you lost.\" ");
        } else if (fortune == 4) {
            System.out.println("Fortune cookie says: \"You will get your dream job.\" ");
        } else if (fortune == 5) {
            System.out.println("Fortune cookie says: \"You will escape from prison.\" ");
        } else if (fortune == 6) {
            System.out.println("Fortune cookie says: \"You will get the bike you dreamed about.\" ");
        } else {
            System.out.println("Lucky number 7!");
        }
    }
}
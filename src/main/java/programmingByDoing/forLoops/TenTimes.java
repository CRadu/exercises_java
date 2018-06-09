/**
 * Write a program that prints the important phrase "Mr. Mitchell is cool." on the screen ten times. Use a for loop to do it.
 */
package programmingByDoing.forLoops;

public class TenTimes {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <=10; i++) {
            count++;
            System.out.println(count + " Mr. Mitchell is cool.");

        }
    }
}
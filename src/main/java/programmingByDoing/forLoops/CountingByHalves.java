/**
 * Write a program that uses a for loop. With the loop, make the variable x go from -10 to 10, counting by 0.5. (This means that x can't be an int.)
 */
package programmingByDoing.forLoops;

public class CountingByHalves {
    public static void main(String[] args) {
        for (double x = -10; x <= 10; x = x + 0.5) {
            System.out.println(x + " ");
        }
    }
}
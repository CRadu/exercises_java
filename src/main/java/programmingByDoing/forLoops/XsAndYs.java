/**
 * Write another program that uses a for loop. With the loop, make the variable x go from -10 to 10, counting by 0.5. (This means that x can't be an int.)
 * <p>
 * Inside the body of the loop, make another variable y become the current value of x squared. Then display the current values of both x and y.
 * <p>
 * To get your output to line up like mine, use a tab.
 */
package programmingByDoing.forLoops;

public class XsAndYs {
    public static void main(String[] args) {
        System.out.println("x     y");
        System.out.println("==========");
        for (double x = -10, y = (x * x);
             x <= 10 && y <= 100;
             x = x + 0.5,
                     y = (x * x)) {
            System.out.println(x + "   " + y);
        }
    }
}

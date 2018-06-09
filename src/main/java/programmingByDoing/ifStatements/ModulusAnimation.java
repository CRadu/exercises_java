/**
 * In this program, you'll use a loop to draw a simple ASCII-based animation on the screen, and you will use modulus (%) to determine which frame of the animation to show. (You will learn how to create your own loops later.)
 */
package programmingByDoing.ifStatements;

public class ModulusAnimation {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 80; i++) {
            if (i % 10 == 0) {
                System.out.print(" Mr. Mitchell is cool. \r");
            } else if (i % 10 == 1) {
                System.out.println("oooOOO");
            } else if (i % 10 == 2) {
                System.out.println(" ooOOOo");
            } else if (i % 10 == 3) {
                System.out.println("  oOOOoo");
            } else if (i % 10 == 4) {
                System.out.println("   OOOooo");
            } else if (i % 10 == 5) {
                System.out.println("    oooOOO");
            } else if (i % 10 == 6) {
                System.out.println("     ooOOOo");
            } else if (i % 10 == 7) {
                System.out.println("      oOOOoo");
            } else if (i % 10 == 8) {
                System.out.println("       OOOooo");
            }
            Thread.sleep(200);
        }

    }
}
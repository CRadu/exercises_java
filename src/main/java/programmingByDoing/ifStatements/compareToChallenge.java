/**
 * Write a program that compares several Strings using the compareTo() method. You should display the Strings and display the integer that compareTo() gives you.
 * <p>
 * You must have five examples which result in a number less than 0, five examples which result in a number greater than 0, and two examples which give you exactly 0. This means you need a total of twelve examples.
 * <p>
 * You may not just flip the Strings around; you must have twelve different examples.
 * <p>
 * Here's an example:
 * <p>
 * System.out.print("Comparing \"axe\" with \"dog\" produces ");
 * int i = "axe".compareTo("dog");
 * System.out.println(i);
 * <p>
 * System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
 * System.out.println( "applebee's".compareTo("apple") );
 */
package programmingByDoing.ifStatements;

public class compareToChallenge {
    public static void main(String[] args) {
        int i;

        System.out.println("Comparing \\\"apa\\\" with \\\"apa\\\" produces ");
        i = "apa".compareTo("apa");
        System.out.println(i);
        System.out.println("Comparing \\\"carte\\\" with \\\"parte\\\" produces ");
        i = "carte".compareTo("dovleac");
        System.out.println(i);
        System.out.println("Comparing \\\"elefant\\\" with \\\"fata\\\" produces ");
        i = "elefant".compareTo("fata");
        System.out.println(i);
        System.out.println("Comparing \\\"garla\\\" with \\\"\\\" haltera ");
        i = "garla".compareTo("haltera");
        System.out.println(i);
        System.out.println("Comparing \\\"iapa\\\" with \\\"baba\\\"jad ");
        i = "iapa".compareTo("jad");
        System.out.println(i);
        System.out.println("Comparing \\\"katrina\\\" with \\\"latra\\\" produces ");
        i = "katrina".compareTo("latra");
        System.out.println(i);
        System.out.println("Comparing \\\"mana\\\" with \\\"nasture\\\" produces ");
        i = "katrina".compareTo("latra");
        System.out.println(i);
        System.out.println("Comparing \\\"lavanda\\\" with \\\"ied\\\" produces ");
        i = "lavanda".compareTo("ied");
        System.out.println(i);
        System.out.println("Comparing \\\"imn\\\" with \\\"balada\\\" produces ");
        i = "imn".compareTo("balada");
        System.out.println(i);
        System.out.println("Comparing \\\"oaie\\\" with \\\"berbec\\\" produces ");
        i = "oaie".compareTo("berbec");
        System.out.println(i);
        System.out.println("Comparing \\\"rosie\\\" with \\\"castravete\\\" produces ");
        i = "rosie".compareTo("castravete");
        System.out.println(i);
        System.out.println("Comparing \\\"cascaval\\\" with \\\"branza\\\" produces ");
        i = "cascaval".compareTo("branza");
        System.out.println(i);
    }
}
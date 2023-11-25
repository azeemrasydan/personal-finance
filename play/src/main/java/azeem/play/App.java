package azeem.play;

import java.util.Scanner;

import azeem.play.models.Person;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");

        mainProgram();


        System.out.println("<================================================>");
        System.out.println("<================================================>");
        System.out.println("<================================================>");
        System.out.println("<================================================>");
        // Add a pause by waiting for user input
        System.out.println("Press Enter to continue...");
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
        } catch (Exception e) {
            // Handle any potential exception, though closing Scanner with System.in
            // typically does not throw exceptions
            e.printStackTrace();
        }
    }

    public static void mainProgram() {
        var azeem = new Person()
    }
}

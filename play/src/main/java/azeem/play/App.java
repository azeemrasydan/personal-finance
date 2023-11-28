package azeem.play;

import java.util.Calendar;
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
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(azeem.play.utility.Date.of("2023-01-01"));

        Person john = new Person(
                "azeem",
                "rasydan",
                azeem.play.utility.Date.of("1995-07-22"),
                "asd",
                calendar);

        System.out.println(john.age());

    }
}

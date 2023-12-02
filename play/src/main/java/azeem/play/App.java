package azeem.play;

import java.text.ParseException;
import java.util.Scanner;

import azeem.play.people.Person;
import azeem.play.utility.Date;
import azeem.play.world.World;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws ParseException {
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

    public static void mainProgram() throws ParseException {

        World world = new World(
                Date.of("2023-01-01").inLocalDate());

        Person ar = new Person(
                "azeem",
                "rasydan",
                Date.of("1995-01-01").inLocalDate(),
                "asd",
                world);

        ar.withStartingCash(3000);

        ar.addRecurringIncome("monthly",
                27,
                Date.of("2021-01-01").inUtilDate(),
                Date.of("2025-01-01").inUtilDate(),
                3000.00);

        ar.addRecurringExpense(
                "monthly",
                27,
                Date.of("2021-01-01").inUtilDate(),
                Date.of("2025-01-01").inUtilDate(),
                2000);

        System.out.println(ar.cashValue());

        world.pass(720).days();

        System.out.println(ar.cashValue());

    }
}

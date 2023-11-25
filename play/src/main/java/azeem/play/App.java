package azeem.play;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import azeem.play.models.Income;
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

    private static Date dateOf(String dateString) {
        return java.sql.Date.valueOf(
                LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    public static void mainProgram() {
        Person john = new Person(
                "azeem",
                "rasydan",
                dateOf("1995-07-22"),
                "asd");

        john.addRecurringIncome(
                "monthly",
                26,
                dateOf("2021-01-01"),
                dateOf("2025-07-07"),
                3000);

        for (Income income : john.incomes()) {
            System.out.println(income.getAmount());
        }

    }
}

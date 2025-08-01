import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int year = OffsetDateTime.now().getYear();

        System.out.println("Em que ano você nasceu? ");
        final int birthYear = sc.nextInt();

        final int age = birthYear >= year ? 0 : year - birthYear;

        System.out.printf("Você nasceu em %s e tem %s ano(s) em %s.\n", birthYear, age, year);
        sc.close();
    }
}

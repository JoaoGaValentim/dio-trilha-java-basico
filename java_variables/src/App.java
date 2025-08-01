import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int year = OffsetDateTime.now().getYear();

        System.out.println("Qual o seu nome? ");
        final String name = sc.nextLine();

        System.out.println("Em que ano você nasceu? ");
        final int birthYear = sc.nextInt();

        final int age = birthYear >= year ? 0 : year - birthYear;

        System.out.printf("%s nasceu em %s e tem %s ano(s) em %s.\n", name, birthYear, age, year);
        sc.close();
    }
}

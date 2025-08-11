import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        final Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = sc.nextLine();

        System.out.println("Informe a agência: ");
        var agency = sc.nextLine();

        System.out.println("Informe o número da conta: ");
        var accountNUmber = sc.nextInt();

        System.out.println("Informe o saldo: ");
        var balance = sc.nextDouble();

        Account account = new Account(name, agency, accountNUmber, balance);
        account.showAccountDetails();

        sc.close();
    }
}

public class Bank {
    static void showBalance() {
        double balance = 20000;
        double withdrawalValue = 1000;

        if(withdrawalValue < balance) {
            balance -= withdrawalValue;
        }

        System.out.println("VOCÊ SACOU: " + withdrawalValue);
        System.out.println("SALDO: " + balance);
    }

    public static void main(String[] args) throws Exception {
        showBalance();
    }
}

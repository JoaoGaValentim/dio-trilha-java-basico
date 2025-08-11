public class Account {
  private final String agency;
  private final String clientName;
  private final int bankAccountNumber;
  private final double balance;

  public Account(String clientName, String agency, int bankAccountNumber, double balance) {
    this.agency = agency;
    this.clientName = clientName;
    this.bankAccountNumber = bankAccountNumber;
    this.balance = balance;
  }

  public void showAccountDetails() {
    System.out.printf("""
          Olá %s obrigado por criar uma conta em nosso banco,
          sua agência é %s, conta %s e seu saldo R$ %.2f já esta
          disponível para saque. \n
        """, clientName, agency, bankAccountNumber, balance);
  }
}

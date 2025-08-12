import java.util.Random;

public class Generator {
  static String generateCEP() {
    final Random random = new Random();
    String cep = "";
    cep = String.valueOf(random.nextInt(19999 - 10000 + 1) + 10000);
    cep += "-";
    cep += String.valueOf(random.nextInt(900) + 0);
    return cep;
  }
}

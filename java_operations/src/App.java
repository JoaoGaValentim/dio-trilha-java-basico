import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int totalTemperatures = 0;
        double[] temperatures = new double[4];

        while (totalTemperatures < 4) {
            System.out.println("Graus em Celcius: ");
            final double celciusTemperature = sc.nextDouble();

            final double fahrenheitTemperature = (celciusTemperature * 1.8) + 32;
            temperatures[totalTemperatures] = fahrenheitTemperature;

            totalTemperatures++;
        }

        for (double temperature : temperatures) {
            System.out.println("Tempratura em Fahrenheit = " + temperature);
            temperature = (temperature - 32) * 0.55555555555;
            System.out.printf("Celcius = %.2f\n", temperature);
        }

        sc.close();
    }
}

import java.util.Scanner;

public class CalculatorSchool {
  static void calculateAndShowAverage() {
    final Scanner sc = new Scanner(System.in);
    System.out.println("Informe as notas: ");

    var lessonPoint = sc.next();
    var lessonsPoint = lessonPoint.split(",");

    var sum = 0.0;
    for (String point : lessonsPoint) {
      sum += Double.valueOf(point);
    }

    var average = sum / lessonsPoint.length;

    if (average >= 7) {
      System.out.printf("Aprovado com média %.2f.\n", average);
    }

    if (average < 7) {
      System.out.printf("Reprovado com média %.2f.\n", average);
    }

    sc.close();
  }

  public static void main(String[] args) {
    calculateAndShowAverage();
  }
}

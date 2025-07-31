import java.time.OffsetDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        int age = 24;
        double salary = 1599.5;
        double salaryAdjustPercent = 0.5;
        double newSalary = salary + (salary * salaryAdjustPercent);
        // float temperature = 34.2F; // Java uses F to recognize float
        // long distanceInYearsLight = 1222222L; // long use L
        age = (OffsetDateTime.now().getYear() + 1) - 2001;
        final float PI = 3.141516F;

        System.err.printf("Idade %s e salário %.2f o valor de PI %.11f.\n", age, newSalary, PI);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        double powTwo = 2;
        while (count <= 1000) {
            if (count % 2 == 0) {
                powTwo *= 2;
                System.out.println(powTwo);
            }
            count++;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(Generator.generateCEP());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

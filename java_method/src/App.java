public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Mathematic.pow(2, 8));
        System.out.println(Mathematic.PI);
        System.out.println(Mathematic.sum(256, 11, 256, 73));
        var result = Mathematic.sum(256, 11, 256, 73) + Mathematic.sum(256, 11);
        System.out.println(result);

        System.out.println(Mathematic.average(10, 8, 10));
    }
}

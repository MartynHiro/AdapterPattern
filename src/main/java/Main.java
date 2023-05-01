public class Main {
    public static void main(String[] args) {
        Ints calculator = new IntsCalculator();

        System.out.println(calculator.sum(5, 2));
        System.out.println(calculator.mult(5, 2));
        System.out.println(calculator.pow(5, 2));
        System.out.println(calculator.sub(5, 2));
        System.out.println(calculator.div(5, 2));

    }
}

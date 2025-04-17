package calculator2;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5, 3));
        System.out.println(calculator.sub(5, 3));
        System.out.println(calculator.mul(5, 3));
        System.out.println(calculator.div(5, 3));
        System.out.println(calculator.history);
    }
}

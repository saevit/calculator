package calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            try {
                // 양의 정수(0 포함)를 입력받기
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = scanner.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = scanner.nextInt();

                int result = calculator.div(num1, num2);

                System.out.println(result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("확인");
        }
    }
}

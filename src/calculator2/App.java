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

                // 사칙연산 기호(+,-,*,/)를 입력받기
                System.out.print("사칙연산 기호(+,-,*,/)를 입력하세요: ");
                char operator = scanner.next().charAt(0);

                // 연산을 진행한 후 결과값을 출력하기
                int result = 0;

                if (operator == '+') {
                    result = calculator.add(num1, num2);
                }
                else if (operator == '-') {
                    result = calculator.sub(num1, num2);
                }
                else if (operator == '*') {
                    result = calculator.mul(num1, num2);
                }
                else if (operator == '/') {
                    result = calculator.div(num1, num2);
                }
                else{
                    throw new IllegalArgumentException("잘못된 연산 기호를 입력하셨습니다.");
                }

                System.out.println("결과: " + result);

            }
            catch (ArithmeticException e) {
                System.out.println("산술 예외: " + e.getMessage());
            }
            catch (IllegalArgumentException e) {
                System.out.println("잘못된 인자: " + e.getMessage());
            }

            // 반복의 종료 의사 확인
            scanner.nextLine(); // next() 후 버퍼에 남은 개행 제거를 위해

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
        }
    }
}

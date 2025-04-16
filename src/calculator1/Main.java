package calculator1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 양의 정수(0 포함)를 입력받기
        Scanner scanner = new Scanner(System.in);

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
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            else {
                result = num1 / num2;
            }
        }
        else{
            System.out.println("잘못된 연산 기호를 입력하셨습니다.");
        }

        System.out.println("결과: " + result);
    }
}

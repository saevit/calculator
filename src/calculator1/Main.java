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

        System.out.println("test num1: " + num1 + ", num2: " + num2 + ", oper: " +operator);
    }
}

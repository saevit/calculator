package calculator3;

import calculator3.Calculator;

import java.util.ArrayList;
import java.util.List;
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
                int result = calculator.calculate(num1, num2, operator);

                System.out.println("결과: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("산술 예외: " + e.getMessage()); // 나눗셈의 분모가 0일 떄
            }
            catch (IllegalArgumentException e) {
                System.out.println("잘못된 인자: " + e.getMessage()); // 사칙연산 기호가 아닐 때
            }

            // 히스토리(연산 결과) 가져오기
            System.out.println("연산 기록: " + calculator.getResult());

            // 히스토리 수정하기
            scanner.nextLine(); // next() 후 버퍼에 남은 개행 제거를 위해

            System.out.println("연산 기록을 수정하시겠습니까? (yes 입력 시 수정) ");
            String editInput = scanner.nextLine();

            if (editInput.equals("yes")){
                System.out.println("어떤 수정을 진행하시겠습니까? (숫자를 입력해주세요)");
                System.out.println("1: 연산 기록 전체 수정  2: 첫번째 연산 기록 삭제");
                int editChoice = scanner.nextInt();

                scanner.nextLine(); // next() 후 버퍼에 남은 개행 제거를 위해

                if (editChoice == 1) {
                    // 1: 연산 기록 전체 수정
                    // 교체할 연산기록 입력
                    System.out.println("교체할 연산 기록을 작성하십이오. (공백으로 구분)");
                    String editNum = scanner.nextLine();

                    // 입력 된 문자열 List형태로 만들기
                    String[] split = editNum.split(" ");  // 문자열 공백 기준으로 자르기
                    List<Integer> newResult = new ArrayList<>();
                    for (String s : split) {
                        newResult.add(Integer.valueOf(s)); // 자른 문자열 숫자로 변형
                    }

                    // 연산 기록 새롭게 수정 및 결과 출력
                    calculator.setResult(newResult);
                    System.out.println("수정된 연산 기록: " + calculator.getResult());
                }
                else if (editChoice == 2){
                    // 2: 첫번째 연산 기록 삭제
                    calculator.removeResult();
                    System.out.println("수정된 연산 기록: " + calculator.getResult());
                }
                else {
                    System.out.println("존재하지 않는 옵션입니다.");
                }
            }

            // 반복의 종료 의사 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exitInput = scanner.nextLine();
            if (exitInput.equals("exit")) {
                break;
            }
        }
    }
}
package calculator2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    // 속성
    // 연산 결과를 저장하는 컬렉션 타입 필드
    List<Integer> history;

    // 생성자
    Calculator() {
        history = new ArrayList<>();
    }

    // 기능
    public int calculate(int num1, int num2, char operator){
        int result;
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
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            result = num1 / num2;
        }
        else{
            throw new IllegalArgumentException("잘못된 연산 기호를 입력하셨습니다.");
        }
        history.add(result);
        return result;
    }
}

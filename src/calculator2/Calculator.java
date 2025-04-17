package calculator2;

import java.util.ArrayList;

public class Calculator {
    // 속성
    // 연산 결과를 저장하는 컬렉션 타입 필드
    ArrayList<Integer> history;

    // 생성자
    Calculator() {
        history = new ArrayList<>();
    }

    // 기능
    public int add(int num1, int num2) {
        int result = num1 + num2;
        history.add(result);
        return result;
    }

    public int sub(int num1, int num2) {
        int result = num1 - num2;
        history.add(result);
        return result;
    }

    public int mul(int num1, int num2) {
        int result = num1 * num2;
        history.add(result);
        return result;
    }

    public int div(int num1, int num2) {
        int result = num1 / num2;
        history.add(result);
        return result;
    }
}

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

    public int div(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        else {
            int result = num1 / num2;
            history.add(result);
            return result;
        }
    }
}

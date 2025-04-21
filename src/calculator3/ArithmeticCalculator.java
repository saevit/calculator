package calculator3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    // 속성
    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Integer> Result;

    // 생성자
    public ArithmeticCalculator() {
        Result = new ArrayList<>();
    }

    // 기능
    public int calculate(int num1, int num2, char inputOerator){
        int result = 0;

        OperatorType operator = OperatorType.chartoSymbol(inputOerator);

        switch (operator){
            case ADD:
                result = num1 + num2;
                break;
            case SUB:
                result = num1 - num2;
                break;
            case MUL:
                result = num1 * num2;
                break;
            case DIV:
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
        }

        Result.add(result); // 연산 기록 저장
        return result;
    }

    // 게터
    List<Integer> getResult() {
        return this.Result;
    }

    // 세터
    void setResult(List<Integer> result) {
        this.Result = result;
    }

    // 가장 먼저 저장된 연산 기록을 삭제하는 기능
    public void removeResult() {
        this.Result.remove(0);
    }

}

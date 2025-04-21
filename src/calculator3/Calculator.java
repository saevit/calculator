package calculator3;

import java.util.ArrayList;
import java.util.List;

import calculator3.OperatorType;

public class Calculator {
    // 속성
    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Integer> Result;

    // 생성자
    public Calculator() {
        Result = new ArrayList<>();
    }

    // 기능
    public int calculate(int num1, int num2, char operator){
        int result;
        if (operator == OperatorType.ADD.getSymbol()) {
            result = num1 + num2;
        }
        else if (operator == OperatorType.SUB.getSymbol()) {
            result = num1 - num2;
        }
        else if (operator == OperatorType.MUL.getSymbol()) {
            result = num1 * num2;
        }
        else if (operator == OperatorType.DIV.getSymbol()) {
            if (num2 == 0) {
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            result = num1 / num2;
        }
        else{
            throw new IllegalArgumentException("잘못된 연산 기호를 입력하셨습니다.");
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

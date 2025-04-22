package calculator3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    // 속성
    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<T> Result;

    // 생성자
    public ArithmeticCalculator() {
        Result = new ArrayList<>();
    }

    // 기능
    public T calculate(T num1, T num2, char inputOerator){
        T result;

        OperatorType operator = OperatorType.chartoSymbol(inputOerator);

        // num 값과 결과를 담을 result double로 준비
        double doubleNum1 = num1.doubleValue();
        double doubleNum2 = num2.doubleValue();
        double doubleResult = 0;

        switch (operator) {
            case ADD:
                doubleResult = doubleNum1 + doubleNum2;
                break;
            case SUB:
                doubleResult = doubleNum1 - doubleNum2;
                break;
            case MUL:
                doubleResult = doubleNum1 * doubleNum2;
                break;
            case DIV:
                if (doubleNum2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                doubleResult = doubleNum1 / doubleNum2;
                break;
        }

        result = (T) Double.valueOf(doubleResult);
        Result.add(result); // 연산 기록 저장
        return result;
    }

    // 게터
    List<T> getResult() {
        return this.Result;
    }

    // 세터
    void setResult(List<T> result) {
        this.Result = result;
    }

    // 가장 먼저 저장된 연산 기록을 삭제하는 기능
    public void removeResult() {
        this.Result.remove(0);
    }

    // 입력값 보다 큰 연산 기록을 출력하는 기능
    List<T> getGreaterResult(T num) {
        List<T> ret = Result.stream()
                .filter(i -> i.doubleValue() > num.doubleValue())
                .collect(Collectors.toList());

        return ret;
    }
}
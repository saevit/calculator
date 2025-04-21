package calculator3;

public enum OperatorType {
    ADD('+'),
    SUB('-'),
    MUL('*'),
    DIV('/');

    //속성
    private final char symbol;

    //생성자
    OperatorType (char symbol) {
        this.symbol = symbol;
    }

    //기능
    // 문자로 반환
    public char getSymbol() {
        return symbol;
    }

    // 문자열를 OperatorType으로 반환
    public static OperatorType chartoSymbol(char inputOperator) {
        // OperatorType.values() = {OperatorType.ADD, OperatorType.SUB, OperatorType.MUL, OperatorType.DIV}
        for (OperatorType operatortype : OperatorType.values()) {
            if (inputOperator == operatortype.getSymbol()) {
                return operatortype;
            }
        }
        // 연산 기호가 OperatorType을 모두 돌아보아도 없다면 예외처리
        throw new IllegalArgumentException("잘못된 연산 기호를 입력하셨습니다.");
    }
}
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
    public char getSymbol() {
        return symbol;
    }
}
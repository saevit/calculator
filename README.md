# 계산기 과제
2025.04.16~2025.04.23


## 사용한 기술
- Java


## 기능 소개
### Lv1. 클래스가 없는 사칙 연산 계산기
- Scanner을 통하여 양의 정수(0포함)를 각각 2번 입력 받는다.
- Scanner을 통하여 연산 기호를 문자로 입력 받아 사칙 연산을 수행한다.
- 연산 결과 출력 후 exit를 입력하면 종료되며, 그 외에는 연산이 반복된다.

### Lv2. 클래스를 적용한 사칙 연산 계산기
- Calculator 클래스의 calculate()를 통하여 사칙 연산을 수행하며, 연산 결과는 내부의 List<T> Result에 저장된다.
- 연산 후, 저장된 연산 기록 리스트가 getResult()을 통하여 출력된다.
- 옵션 선택:
  - 옵션 1: setResult()를 통하여 연산 기록을 수정이 가능하다.
  - 옵션 2: removeResult()를 통하여 가장 먼저 저장된 연산 기록이 삭제된다.

### Lv3.Enum, 제네릭, 람다 & 스트림을 적용한 계산기
- Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리한다.
- ArithmeticCalculator 클래스를 제네릭으로 설정하여 int뿐만 아니라 double 끼리의 연산도 가능하게 한다.
- 옵션 선택:
  - 옵션 1: 입력 받은 값보다 큰 연산 기록만을 출력한다.
  - 옵션 2: Lv2의 옵션1 (연산 기록 수정)
  - 옵션 3: Lv2의 옵션2 (첫번째 연산 기록 삭제)

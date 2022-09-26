package Training_4;

/* 문제 1 */
// 사칙연산을 할 수 있는 클래스 Calculator을 생성하고 정수를 2개 입력받아 계산한 프로그램을 작성하세요
// 맴버 변수 : int num1, num2, result
// 맴버 메서드 : sum, sub, multi, div
// 모든 결과는 int 데이터 타입으로 사용, 메서드 4가지 형태 중 아무꺼나 사용

import java.util.Scanner;

public class Training_1_Calculator {
    private int num1;
    private int num2;
    private int result;

    public Training_1_Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }

    public void sum() {
        this.result = this.num1 + this.num2;
        System.out.println(result);
    }

    public void sub() {
        this.result = this.num1 - this.num2;
        System.out.println(result);
    }

    public void multi() {
        this.result = this.num1 * this.num2;
        System.out.println(result);
    }

    public void div() {
        this.result = this.num1 / this.num2;
        System.out.println(result);
    }

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("정수 2개를 입력하세요>>");
        Training_1_Calculator cal = new Training_1_Calculator(scanner.nextInt(), scanner.nextInt());

        cal.sum();
        cal.sub();
        cal.multi();
        cal.div();

        System.out.print("정수 2개를 입력하세요>>");
        Training_1_Calculator c1 = new Training_1_Calculator(scanner.nextInt(), scanner.nextInt());

        c1.result = c1.num1 + c1.num2;
        System.out.println(c1.result);

        c1.result = c1.num1 - c1.num2;
        System.out.println(c1.result);

        c1.result = c1.num1 * c1.num2;
        System.out.println(c1.result);

        c1.result = c1.num1 / c1.num2;
        System.out.println(c1.result);

    }
}

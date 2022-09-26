package Training_3;

import java.util.Scanner;

public class Question_3_1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* 실습문제 1 (p126) */
        // charAt() : String 타입의 데이터 중 지정한 index의 문자를 char타입으로 변환
        System.out.print("알파벳 한 문자를 입력하세요>> "); // [알][파][벳][][한][][문][자][를][][입][력][하][세][요][>][>]
        String str = scanner.next();                    //   0  1   2  3  4  5  6  7 ....
        char c = str.charAt(0);                         // 문자 배열 0 번째

        // char 타입의 데이터 a는 아스키코드 문자로는 'a' 정수는 97로 표현
        // 문자지만 정수형으로 인식하기 때문에 증감 연산자가 실행 가능 i++

        for (char a='a'; a<=c; a++) {        // str>알파벳 e -> c -> a<e; a++ (a~e)
            for (char b=a; b<=c; b++) {     // b<=e; b++ (a~e)
                System.out.print(b);
            }
            System.out.println();
        }

    }

}

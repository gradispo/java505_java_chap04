package Training_3;

import java.util.Scanner;

public class Question_3_6 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* 실습문제 6 (p127)*/
        // 1. eng 배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확인
        // 2. 있으면 해당 index 번호 확인하고 검색 중지
        // 3. kor 배열의 index 번호에 있는 단어 출력
        // 4. 입력된 단어가 exit 이면 프로그램 종료
        String eng[] = { "student", "love", "java", "happy", "future", "home" };
        String kor[] = { "학생", "사랑", "자바", "행복", "미래", "학교" };

        while (true) {
            System.out.print("영어 단어를 입력하세요>>");
            String word = scanner.next();

            if (word.equals("exit")) {
                System.out.println("종료합니다..");
                break;
            }

            // 배열에서 검색해서 찾는 값의 경우 index 를 정의 해주면 간편하다.
            int index = -1; // 배열의 시작은 0으로 시작하기 때문에 -1 = 0번

            for (int i=0; i<eng.length; i++) {
                if (word.equals(eng[i])) {
                    index = i;
                    break;
                }
            }

            if (index > -1) {
                System.out.println(kor[index]);
            }
            else {
                System.out.println("그런 영어 단어가 없습니다.");
            }

        }


    }

}

import java.util.Random;
import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 숨은 번호 맞추기 게임

        while (true) {
            Random r = new Random();
            int k = r.nextInt(100);

            int i = 1;
            int x;
            int min = 0;
            int max = 99;

            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println("0-99");
            System.out.print(i + ">>");
            x = scanner.nextInt();

            while (x != k) {
                if (x < k) {
                    System.out.println("더 높게");
                    min = x;
                    System.out.println(min + "-" + max);
                    System.out.print(++i + ">>");
                    x = scanner.nextInt();
                    continue;
                } else if (x > k) {
                    System.out.println("더 낮게");
                    max = x;
                    System.out.println(min + "-" + max);
                    System.out.print(++i + ">>");
                    x = scanner.nextInt();
                    continue;
                }
            }

            System.out.println("맞았습니다.");
            System.out.print("다시 하시겠습니까(y/n)");

            if (scanner.next().equals("y")) {
                continue;
            } else {
                break;
            }
        }

        // 실습문제 1)

        System.out.print("알파벳 한 문자를 입력하세요>>");
        String s = scanner.next(); // 문자열로 읽음
        char c = s.charAt(0); // 문자열의 첫 번째 문자

        for (int i = 'a'; i <= c; i++) {
            if (i <= c) {
                System.out.print((char) i);
            }
            for (int j = i + 1; j <= c; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }

        // 실습문제 2)

        int[] num = new int[10]; // 배열 10개 저장
        System.out.println("정수 10개 입력>>");

        for (int i = 0; i < 10; i++) { // i는 배열에 저장되는 값들
            num[i] = scanner.nextInt(); // num[i] 배열 데이터에 순차적으로 저장
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] % 3 == 0) { // 3의 배수가 맞으면 출력
                System.out.print(num[i] + " ");
            }
        }

        // 실습문제 3)

        System.out.println("");
        String eng[] = { "student", "love", "java", "happy", "future", "home" };
        String kor[] = { "학생", "사랑", "자바", "행복", "미래", "학교" };

        while (true) {

            System.out.print("영어 단어를 입력하세요>>");
            String word = scanner.next();

            if (word.equals("exit")) { // word변수에 exit가 true
                System.out.println("종료"); // 종료 break;
                break;
            } else {
                for (int i = 0; i < eng.length; i++) { // exit가 아니고
                    if (word.equals(eng[i])) { // 영어 단어가 배열값과 일치하면 true
                        System.out.println(kor[i]); // 한글 단어장 배열 순서 출력 후 종료 break;
                        break;
                    } else if (!word.equals(eng[i]) && i == 5) { // 일치하는 단어가 없으면 true
                        System.out.println("그런 영어 단어는 없습니다.");
                    }
                }

            }

        }

        // bonus 1)

        int intArray[][]; // 2차원 정수 배열 선언
        intArray = new int[3][4]; // intArray에 3x4 정수 배열 생성 //______

        // 12개의 정수를 랜덤하게 발생시켜 배열에 순서대로 저장한다.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                intArray[i][j] = (int) (Math.random() * 10); // 0~9의 랜덤 정수
            }
        }

        // 3x4 배열을 출력한다
        for (int i = 0; i < intArray.length; i++) { // length 필드를 이용하라 //______
            for (int j = 0; j < intArray[i].length; j++) { // length 필드를 이용하라 //______
                System.out.print(intArray[i][j] + "\t"); // 원소 [i][j] 출력 //______
            }
            System.out.println(); // 다음줄로 넘어감
        }

        // 3x4 배열의 합을 구하여 출력한다.
        int i = 0, sum = 0;
        while (i < 3) { // 3개의 각 행에 대해 반복
            for (int j = 0; j < 4; j++) { // ______
                sum += intArray[i][j]; // ______
            } // ______
            i++; // ______
        }
        System.out.println("합은 " + sum);

    }
}
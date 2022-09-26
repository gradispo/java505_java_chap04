package Training_3;

import java.util.Scanner;

public class Bonus_1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Bonus 1 (p129)*/

        int intArray[][]; // 2차원 정수 배열 선언
        /* 입력부분 */ intArray = new int[3][4]; // intArray에 3x4 정수 배열 생성

        // 12개의 정수를 랜덤하게 발생시켜 배열에 순서대로 저장한다.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                // Math.radom() * 10 : 랜덤 숫자를 발생시키기 위한 수학 클래스의 함수
                // Math. 기본형으로 더블형 0.0 ~ 0.1 * 10 = 0.0 ~ 1.0
                // (int) 강제 형변환 1값으로 변환 -> Math.random() * 10 = 10
                intArray[i][j] = (int) (Math.random() * 45);
            }
        }

        // 3x4 배열을 출력한다
        for (int i = 0; i < intArray.length; i++) {

            /* 입력부분 */    for (int j = 0; j < intArray[i].length; j++) {
            /* 입력부분 */    System.out.print(intArray[i][j] + "\t");
            }
            System.out.println(); // 다음줄로 넘어감
        }

        // 3x4 배열의 합을 구하여 출력한다.
        int i = 0, sum = 0;
        while (i < 3) { // 3개의 각 행에 대해 반복

            /* 입력부분 */  for (int j = 0; j < 4; j++) {
            /* 입력부분 */       sum += intArray[i][j];
            /* 입력부분 */      }
            /* 입력부분 */      i++;
        }
        System.out.println("합은 " + sum);

    }

}

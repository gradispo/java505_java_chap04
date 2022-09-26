package Training_4;

/* 문제 3) */
// 1. Rect 클래스의 배열 생성
// 2. 반복문으로 4번 데이터 입력 받기
// 3. 넓이의 전체 합을 출력 (반복문)

import java.util.Scanner;

public class Question_4_3_Rect {
    private int width, height;
    public Question_4_3_Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() { return this.width*height; }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Question_4_3_Rect array[] = new Question_4_3_Rect[4];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1 + " 너비와 높이 >>");
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            array[i] = new Question_4_3_Rect(width,height);
        }
        System.out.println("저장하였습니다...");

        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i].getArea();
        }
        System.out.println("사각형의 전체 합은 " + total);


    }
}

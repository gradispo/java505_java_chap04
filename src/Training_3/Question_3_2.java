package Training_3;

import java.util.Scanner;

public class Question_3_2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* 실습문제 2 (p127) */

        int[] array = new int[10];

        for (int i=0; i<array.length; i++) {
            System.out.println("정수 입력해주세요 " + "(현재 " + (i+1) + "번) : ");
            array[i] = scanner.nextInt();
        }

        for (int i=0; i<array.length; i++) {
            if (array[i] % 3 == 0 ) {
                System.out.print(array[i] + " ");
            }
        }
        
    }

}

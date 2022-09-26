package Training_4;

import java.util.Arrays;
import java.util.Scanner;

public class Training_2_MathRandom {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /* 문제 2 */
        // 1 ~ 45까지의 임의의 숫자 7개를 생성하여 그 결과를 출력하는 프로그램을 작성하세요
        // 배열을 사용하여 랜덤으로 생성된 데이터를 저장
        // Math.random() 사용

        System.out.println("임의의 숫자 6개를 생성하여 출력하세요");


        int array[] = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 45) + 1;
            System.out.print(array[i] + "\t");
        }


            /* 문제 3 */
        // 문제 2를 여러번 실행 시 배열에 저장되는 숫자가 중복되는 상황이 발생됨, 중복되는 숫자를 제외하고
        // 총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하세요

        System.out.println("\n임의의 숫자 6개를 생성하여 출력하세요");


        int array1[] = new int[7];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 45) + 1;

            for (int j = 0; j <= i-1; j++) {
                while (array1[i] == array1[j]) {
                    array1[j] = (int) (Math.random() * 45) + 1;
                }
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }


        /* 강사님이 만드신거 */

        // 번호 배열 생성
        int lotto2[] = new int[7];

        // 로또번호 생성 1 ~ 45
        for (int i = 0; i < lotto2.length;i++) { // [][][][][][][]
            int rnd = (int)((Math.random() * 45) + 1);

              /* 중복제거 */
//            []
//            [][]
//            [][][]
//            [][][][]
//            [][][][][]
//            [][][][][][]
//            [][][][][][][]

//            i=1 j=0
//            i=2 j=1
//            ..   ..


            // 중복제거
            for (int j = 0; j < i; j++) {
                // 동일한 값이 있는지 확인
                if (rnd == lotto2[j]) {
                    // 동일한 값이 있을 경우 현재 루프를 다시 한번 더 실행함
                    i--; // 나중에 자동으로 1증가할 카운트 변수를 먼저 1감소 시켜서
                         // 동일한 값이 나올수 있도록 변경, 동일한 번호 루프를 돌 수 있게 된다.
                    break;
                }
                // 동일한 값이 아니면 배열에 저장
                lotto2[i] = rnd;
            }

            // 첫번째 루프의 경우 중복제거 루틴으로 빠지지 않기 때문에
            // 데이터가 저장되는 부분이 없으므로 0번 루프때만 동작되는 if문을 실행함
            if (i == 0) {
                lotto2[i] = rnd;
            }
        }

        // 낮은 값부터 정렬
        Arrays.sort(lotto2);

        // 화면출력
        for (int i = 0; i < lotto2.length; i++) {
            System.out.print("\n\n" + lotto2[i] + " ");
        }


        }

        //  int[] resultArr = Arrays.stream(array).distinct().toArray();
        //  System.out.print(Arrays.toString(resultArr));



}



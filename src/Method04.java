import java.util.Arrays;
import java.util.Scanner;

public class Method04 {

    public static int[] input() {

        int[] number = new int[10];
        System.out.print("정수 10개 입력>>");

        for (int i = 0; i < 10; i++) {
            number[i] = scanner.nextInt();
        }

        return number;
    }

    public static void output(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        문제 1) 책126페이지의 5번 문제를 풀고, 메서드를 사용하는 방식으로 변환하세요

        int number[] = new int[10];

        number = input();

        Arrays.sort(number);

        output(number);


        // 버블 정렬 , 알고리즘
//        for(int i=0; i<number.length; i++) {
//            for(int j=i; j<number.length; j++) {
//                if(number[i] > number[j]) {
//                    int tmp = number[i];
//                    number[i] = number[j];
//                    number[j] = tmp;
//                }
//            }
//        }




//        // input
//        System.out.print(" 정수 10개 입력>>");
//
//        for (int i=0; i<10; i++) {
//            number[i] = scanner.nextInt();
//        }
//
//        // sort = arrays.sort(변수명);
//        // output
//        Arrays.sort(number);
//        for (int i=0; i<number.length; i++) {
//            System.out.print(number[i] + " ");
//        }






    }



}

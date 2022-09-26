package Training_3;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge_1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Open Challenge (p121)*/
        // 1. 0 ~ 99 까지의 숫자를 컴퓨터가 랜덤 숫자 선택, 사용자가 키보드로 입력
        // 2. 사용자 입력을 통해 얻은 데이터가 높은지 낮은지 판단 (if ~ else문), 반복 실행
        // 3. 정답을 맞춘후 다시 게임을 할 것인지 확인

        Random r = new Random(); // 랜덤 값 생성하기 위한 클래스
        int random; // 컴퓨터가 랜덤으로 생선한 데이터가 저장될 변수
        int min; // 카드에 적힌 수의 범위 설정할 변수
        int max;

        // 전체 게임의 시작, 무한 반복
        while (true) {
            int i = 1; // 몇 번째 입력인지 확인하기 위한 변수
            min = 0; // 게임 시작시 초기값을 가장 낮은 0 으로 설정
            max = 99; // 게임 시작시 초기값을 가장 높은 99 로 설정
            random = r.nextInt(100); // r(random).nextInt( 100까지의 수 )
            System.out.print("UP & DOWN 게임 입니다.");

            // 사용자 입력을 반복
            while (true) {
                System.out.println(min + " - " + max);
                System.out.print(i + " >> ");

                int userInput = scanner.nextInt(); // 사용자 입력 부분

                // 정상 범위 확인
                if (userInput > max || userInput < min) {
                    System.out.println("범위를 벗어났습니다.");
                }
                else {
                    // 입력 값이 컴퓨터의 랜덤 값과 같을 경우
                    if (userInput == random) {
                        System.out.println("정답 입니다.");
                        break;
                    }
                    // 사용자 입력이 컴퓨터의 랜덤 값보다 클 경우
                    else if (userInput > random) {
                        System.out.println("더 낮게");
                        max = userInput; // 최대 크기의 범위를 사용자의 입력 데이터로 설정
                    }
                    // 사용자 입력이 랜덤 값 보다 작을 경우
                    else {
                        System.out.println("더 높게");
                        min = userInput; // 최소 크기의 범위를 사용자의 입력 데이터로 설정
                    }
                }
                i++;
            }
            System.out.println("다시 하겠습니까? (y/n) >> ");
            if (scanner.next().equals("n")) {
                break;
            }
        }



    }

}

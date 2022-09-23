import java.util.Scanner;

public class Method03 {

//    public static int input() { // 메서드 선언부 = 실행방법 , void = 반환값이 void는 return이 없다는 뜻.
//        System.out.print("출력할 구구단 단수를 입력하세요 : ");
//        int dansu = scanner.nextInt(); // 입력
//        return dansu;
//    } // {} 실행부
//
//    public static void output(int dansu) { // 현재 int dansu가 초기화 되지 않기 때문에 외부에서 불러와야한다.
//        for (int i = 1; i < 10; i++) { // 출력
//            System.out.println(dansu + " * " + i + " = " + dansu * i);
//        }
//    }
//
//    public static int inputScore() { // return 반환시 int 데이터타입이면 static 뒤에 int
//        ////////////// 점수 입력
//        System.out.print("점수를 입력해주세요 : ");
//        int score = scanner.nextInt();
//        return score; // 입력받은 score 점수를 외부로 리턴.
//    }
//
//    public static String calLevel(int score) { // return시 문자열이면 String
//        ////////////// 등급 계산
//        String level ="F"; // 기본값을 F로 주지 않을거면 if문 마지막에 else문으로 F값을 넣어줌
//
//        if (score>=90) { // 비교 해야 하는 점수가 필요하다 calLevel(int score)
//            level = "A";
//        } else if (score>=80) {
//            level = "B";
//        } else if (score>=70) {
//            level = "C";
//        } else if (score>=60) {
//            level = "D";
//        }
//
//        return level;
//    }


//    public static void printResult(int score, String level) {
//        ////////////// 결과 출력
//        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + level + "입니다.");
//    }

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("\n----------\n");

//        int dansu = input();
//        output(dansu);


//        inputScore();
//        calLevel(80);
//        int score = inputScore();
//        String level = calLevel(score);
//        printResult(score, level); // level에서 오류가 나오기 때문에 calLevel에서 level 값 return

        // 데이터 저장부
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0.0;
        String level = "F";

        kor = scoreInput("국어");
        eng = scoreInput("영어");
        math = scoreInput("수학");

        total = totalCal(kor, eng, math);
        avg = avgCal(total);
        level = levelCal(avg);

        printResult(total, avg, level);



    }


    public static int scoreInput(String name) {
        // 일반 데이터 입력부
        System.out.print(name + "점수를 입력해주세요 : ");
        int score = scanner.nextInt();

        return score;
    }

    public static int totalCal(int kor, int eng, int math) {
        // 총점
        return kor + eng + math;
    }

    public static double avgCal(int total) {
        // 평균
        return (double)total /3;
    }

    public static String levelCal(double avg) {
        // 등급
        String level = "F";

        if (avg>=90) {
            level = "A";
        } else if (avg>=80) {
            level = "B";
        } else if (avg>=70) {
            level = "C";
        } else if (avg>=60) {
            level = "D";
        }

        return level;
    }

    public static void printResult(int total, double avg, String level) {
        // 출력
        System.out.println("당신의 점수는 " + total + "점이고, 평균점수는 " + avg + " 등급은 " + level + "입니다.");
    }
}

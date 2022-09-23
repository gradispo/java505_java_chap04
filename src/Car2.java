// 라이브러리용 클래스
public class Car2 {
    public String name;

    public void Car2() {

    }

//  클래스는 종류가 2가지
//    1. 라이브러리 - 메인 메소드가 없다
//    2. 실행용 - main()


    public void run() {
        System.out.println(name + "가 달립니다.");
    }

    public void stop() {
        System.out.println(name + "가 멈춥니다.");
    }

    public void sound() {
        System.out.println(name + "경적소리 빵빵");
    }





    public static void main(String[] args) {

    }
}

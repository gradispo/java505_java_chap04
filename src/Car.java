public class Car {

    String name;
    String type;
    String gas = "가솔린";
    String size;
    int speed = 0;
    // 맴버 변수 5개 생성

    
//    void가 없는 public Car() = 생성자
//    생성자 : 객체 생성 시 new 명령어에 의해서자동 실행되는 메서드
//    맴버 변수의 초기화하는데 사용
    public Car(String carName, String carType, String carGas, String carSize) {
        name = carName;
        type = carType;
        gas = carGas;
        size = carSize;
    }


    // 메소드 생성
    public void move() {
        System.out.println("자동차가 " + speed + "의 속도로 움직입니다.");
    }

    public void stop() {
        System.out.println("자동차가 멈춥니다.");
    }
}

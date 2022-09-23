public class Singleton {
//    private 접근제한자 : private로 지정된 맴버는 해당 클래스 내에서만 사용이 가능함

    private static Singleton singletone = new Singleton();

//    생성자의 접근제한자에 private을 사용하면 객체 생성 시 new 키워드를 사용할 수 없음 (메모리 등록이 안됨, 객체 생성 불가능)
//    객체 생성이 불가능
    private Singleton() { }

    public static Singleton getInstance() {
        return singletone;
    }
}

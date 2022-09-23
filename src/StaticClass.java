public class StaticClass {
    public String name; // staticclass member
    public int age; // staticclass member


    // static 입력시 객체를 생성하지 않아도 접근가능
    public static String job;

    public StaticClass() {
        this("아이유");
    }

    public StaticClass(String name) { // 매개변수를 받은 이름을
        this(name, 30); // 기본을 사용
    }

    public StaticClass(String name, int age) { // 생성자를 실행, 매개변수 2개를 받고 , 위 맴버 변수를 받아서
        this.name = name; // 데이터 삽입
        this.age = age;
    }

    public static void getJob() {
        System.out.println("static 직업 : " + job);
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() { // 맴버 메서드
        System.out.println("이름 : " + this.name + "\n나이 : " + this.age); // 맴버 변수에 저장된 데이터 출력
    }
}

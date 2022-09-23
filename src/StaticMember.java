public class StaticMember {

    public static void main(String[] args) {

        // 생선된 객체를 사용하려면
        // 객체 생성 후 객체의 맴버를 사용 하는 방법
        // sc1 = new 라는 객체를 생성
        StaticClass sc1 = new StaticClass(); // 매개변수 써도 되고 안써도 되고, 안쓰면 기본값
        sc1.getInfo(); // 전체값 출력
        System.out.println("나이 : " + sc1.age);
        System.out.println("이름 : " + sc1.name);

        StaticClass.job = "가수";
        System.out.println("static 직업 : " + StaticClass.job);
        StaticClass.getJob();

        System.out.println("\n----- -----\n");

//        Calc 클래스의 맴버 메서드인 abs, max, min 이 모두 정적 맴버이기 때문에
//        객체 생성 없이 클래스 이름 으로 직접 접근이 가능하다
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));

//        정적 맴버도 객체 생성 후 사용이 가능하지만 그렇게는 잘 사용하지 않는다
//        정적 맴버는 해당 클래스를 객체화하여 사용 시 객체화된 모든 객체들과 함께 메모리 공간을 공유함
        Calc c = new Calc();
        System.out.println(c.abs(-5));
        System.out.println(c.max(10,8));
        System.out.println(c.min(10,8));

        System.out.println("\n----- -----\n");
        Calc c1 = new Calc();
        Calc c2 = new Calc();


        // 일반 맴버를 사용한 연산
        c1.iNum1 = 10;
        c1.iNum2 = 20;
        c1.iResult = c1.iNum1 + c1.iNum2;
        System.out.println("객체 c1의 iResult : " + c1.iResult);

        c2.iNum2 = 100;
        c2.iNum1 = 200;
        c2.iResult = c2.iNum1 + c2.iNum2;
        System.out.println("객체 c2의 iResult : " + c2.iResult);
        System.out.println("객체 c1의 iResult : " + c1.iResult); // 위 c2.iResult와 서로 메모리 공간이 달라서 영향을 받지 않는다.

        System.out.println("\n----- -----\n");

        // 정적 맴버를 사용한 연산
        c1.sNum1 = 10;
        c1.sNum2 = 20;
        c1.sResult = c1.sNum1 + c1.sNum2;
        System.out.println("객체 c1의 sResult : " + c1.sResult);

        c2.sNum1 = 100;
        c2.sNum2 = 200;
        c2.sResult = c2.sNum1 + c2.sNum2;
        System.out.println("객체 c2의 sResult : " + c2.sResult);
        System.out.println("객체 c1의 sResult : " + c1.sResult);
        System.out.println("클래스의 sResult : " + Calc.sResult);  // 메모리 공유하기 때문에 값이 300으로 출력


        System.out.println("\n");

        Tv.info = Tv.company + Tv.model;

        System.out.println(Tv.info);


    }

}

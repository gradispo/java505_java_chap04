import java.util.Scanner;

public class PhoneManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int Person = scanner.nextInt();

        Phone2[] Array = new Phone2[Person];
        for (int i=0; i<Array.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력>>");
            Array[i] = new Phone2(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다...");

        label : while(true) {
            System.out.print("검색할 이름>>");
            String Name = scanner.next();
            
            for (int i=0; i< Array.length; i++) {
                if(Name.equals("exit")) {
                    break label;
                }
                else if (Name.equals(Array[i].getName())) {
                    System.out.println(Array[i].getName() + "의 번호는 " + Array[i].getTel() + "입니다.");
                }
                else if (!Name.equals(Array[i].getName()) && i == (Person-1)) {
                    System.out.println(Name + "이(가) 없습니다.");
                }

//                !word.equals(eng[i]) && i == 5

            }
            

            
        } System.out.println("프로그램을 종료합니다...");


    }
}

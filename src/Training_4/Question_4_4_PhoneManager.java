package Training_4;

/* 문제 4) */
// 1. 사용자 입력을 통해서 전화번호를 저장할 배열 크기를 입력받음
// 2. 지정한 크기 만큼의 사용자 정보 입력받음
// 3. 사용자가 입력한 사용자 이름이 있는지 반복문을 통해서 배열 안에 내용과 비교
// 4. 있으면 정보 출력, 없으면 없습니다. 출력
// 5. exit를 입력 받으면 프로그램 종료.

import java.util.Scanner;

public class Question_4_4_PhoneManager {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("인원수>>");
        int person = scanner.nextInt();

        Question_4_4_Phone phoneBook[] = new Question_4_4_Phone[person];

        for (int i = 0; i < phoneBook.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");

            // 지정한 위치에 Question_4_4_Phone 클래스 타입의 객체 생성하여 저장
            phoneBook[i] = new Question_4_4_Phone(scanner.next(), scanner.next());
        }

        System.out.println("저장되었습니다...");

        // 사용자 이름 검색, 무한반복, while (true) { }
        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchName = scanner.next();

            int index = -1; // 배열의 index 번호를 저장할 변수, 검색 불가 : -1, 검색 완료 : 검색된 index 번호

            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            for (int i = 0; i < phoneBook.length; i++) {
                // 검색어로 입력한 이름과 전화번호부에 저장된 이름이 같은지 확인
                if (searchName.equals(phoneBook[i].getName())) {
                    index = i; // 해당 index 번호를 변수 index에 저장
                    break;
                }
            }

            // 검색어로 검색한 결과를 확인
            if (index > -1) {
                System.out.println(phoneBook[index].getName() + "의 번호 " + phoneBook[index].getTel());
            } else {
                System.out.println(searchName + " 이 없습니다.");
            }


        }

    }
}

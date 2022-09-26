package Training_4;

/* 문제 2) */


import java.util.Scanner;

public class Question_4_2_Phone {
    private String name, tel;
    public Question_4_2_Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() { return name; }
    public String getTel() { return tel; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_4_2_Phone phone1;
        Question_4_2_Phone phone2;

        System.out.print("이름과 전화번호 입력 >>");
        phone1 = new Question_4_2_Phone(scanner.next(), scanner.next());
        System.out.print("이름과 전화번호 입력 >>");
        phone2 = new Question_4_2_Phone(scanner.next(), scanner.next());
        System.out.println(phone1.name + " " + phone1.tel);
        System.out.println(phone2.name + " " + phone2.tel);
    }
}
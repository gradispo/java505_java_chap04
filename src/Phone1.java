import java.util.Scanner;

public class Phone1 {
    private String name, tel;
    public Phone1(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름과 전화번호 입력 >>");
        Phone1 firstNameTel = new Phone1(scanner.next(), scanner.next());
        System.out.print("이름과 전화번호 입력 >>");
        Phone1 secondNameTel = new Phone1(scanner.next(), scanner.next());
        System.out.println(firstNameTel.name + " " + firstNameTel.tel);
        System.out.println(secondNameTel.name + " " + secondNameTel.tel);
    }
}

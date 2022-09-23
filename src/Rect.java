import java.util.Scanner;

public class Rect {
    private int width, height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() { return width*height; }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rect[] Array = new Rect[4];
        int sum = 0;

        for (int i=0; i<Array.length; i++) {
            System.out.print((i+1) + " 너비와 높이 >>");
            Array[i] = new Rect(scanner.nextInt(), scanner.nextInt());
            sum = sum + Array[i].getArea();
        }

        System.out.println("저장하였습니다...");
        System.out.println("사각형의 전체 합은 " + sum);

    }
}


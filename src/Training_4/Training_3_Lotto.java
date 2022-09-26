package Training_4;

import java.util.Arrays;

public class Training_3_Lotto {

    public static void main(String[] args) {

        System.out.println("임의의 숫자 6개를 생성하여 출력하세요");

        int lotto[] = new int[7];

        for (int i = 0; i < lotto.length; i++) {
            int radnomNumber = (int)((Math.random()*45) + 1);
            System.out.print(radnomNumber + "(" + i + ")" + " ");
            for (int j = 0; j < i; j++) {
                if (radnomNumber == lotto[j]) {
                    i--;
                    System.out.print("\nif break before\n" + radnomNumber + "(" + i + ")" + " ");
                    break;
                }
                lotto[i] = radnomNumber;
                System.out.print("\nif else\n" + radnomNumber + "(" + i + ")" + " ");
            }

            if (i==0) {
                lotto[i] = radnomNumber;
                System.out.print("\nif\n" + radnomNumber + "(" + i + ")" + " ");
            }
            System.out.print("\nelse\n" + radnomNumber + "(" + i + ")" + " \n\n");
        }

        Arrays.sort(lotto);

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }




    }




}



import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        System.out.println("임의의 숫자 6개를 생성하여 출력하세요");

        int lotto[] = new int[7];

        for (int i = 0; i < lotto.length; i++) {

            int randomNumber = (int) ((Math.random() * 45) +1);

            for (int j = 0; j < i; j++) {
                if (randomNumber == lotto[j]) {
                    i--;
                    break;
                }
                lotto[i] = randomNumber;
            }

            if (i == 0) {
                lotto[i] = randomNumber;
            }

        }

        Arrays.sort(lotto);

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }

}



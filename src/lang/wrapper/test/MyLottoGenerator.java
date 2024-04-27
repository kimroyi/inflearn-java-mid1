package lang.wrapper.test;

import java.util.Random;

public class MyLottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[6];
        int count = 0;
        boolean duplicate;

        while (true) {
            int num = random.nextInt(45) + 1;
            duplicate = false;

            for (int lottoNumber : lottoNumbers) {
                if (num == lottoNumber) {
                    duplicate = true;
                }
            }

            if (!duplicate) {
                lottoNumbers[count] = num;
                count++;
            }

            if (lottoNumbers.length == count) {
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int lottoNumber : lottoNumbers) {
            result.append(lottoNumber).append(" ");
        }

        System.out.println("로또 번호: " + result);
    }
}

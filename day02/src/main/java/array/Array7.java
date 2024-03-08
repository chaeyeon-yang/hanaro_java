package array;

import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // Random하게 중복되지 않은 1~100까지의 수를 발생시킨다.
        // 각 열에 최대값의 합과 최소값의 합을 출력하시오.
        int arr[][] = new int[5][5];
        Random random = new Random();

        // 배열에 중복되지 않은 무작위 수 할당
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int randomNumber;
                boolean isDuplicate;

                do {
                    randomNumber = random.nextInt(100) + 1;
                    isDuplicate = false;

                    for (int k = 0; k < j; k++) {
                        if (arr[i][k] == randomNumber) {
                            isDuplicate = true;
                            break;
                        }
                    }
                } while (isDuplicate);

                arr[i][j] = randomNumber;
            }
        }

        // 최대값과 최소값의 합 출력
        for (int j = 0; j < 5; j++) {
            int maxSum = 0;
            int minSum = 200;

            for (int i = 0; i < 5; i++) {
                maxSum += arr[i][j];
                minSum = Math.min(minSum, arr[i][j]);
            }

            System.out.println("열 " + j + "의 최대값 합: " + maxSum);
            System.out.println("열 " + j + "의 최소값 합: " + minSum);
        }
    }
}

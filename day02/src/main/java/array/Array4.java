package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10) + 1; // 1 ~ 10
        System.out.println(num);

        // int 형 배열
        // 배열에 1~100까지의 숫자를 Random하게 넣고
        // 합과 평균을 구하시오
        // 단 중복되지 않는 숫자를 입력한다.
        int arr[] = new int[100];
        int sum1 = 0;
        double avg1 = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int tmp;
            boolean isDuplicate;

            do {
                tmp = random.nextInt(100) + 1;
                isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (arr[j] == tmp) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            arr[i] = tmp;
            sum1 += tmp;
        }

        avg1 = (double) sum1 / 100;
        System.out.println("Array");
        System.out.println("array: " + Arrays.toString(arr));

        System.out.println("sum: "+sum1);
        System.out.println("avg: "+avg1);
    }

}

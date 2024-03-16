import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 수열의 합
        Scanner sc = new Scanner(System.in);
        System.out.print("n을 입력해주세요. (단, n은 50 이하의 자연수): ");
        int n = sc.nextInt();

        int totalSum = 0;
        for (int i = 1; i < n+1; i++) {
            totalSum += (i*(i+1))/2;
        }

        System.out.println(totalSum);
    }
}

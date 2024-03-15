import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 별 찍기
        Scanner sc = new Scanner(System.in);
        System.out.print("3부터 88까지의 홀수 중 하나를 입력하시오: ");
        int n = sc.nextInt();
        for (int i = 1; i < n+1; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

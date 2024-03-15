import java.util.Scanner;

public class Main {
    // 369 게임의 달인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~10 사이의 정수를 입력해주세요.");
        int user = sc.nextInt();
        for (int i = 1; i < user+1; i++) {
            if (i%3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
}

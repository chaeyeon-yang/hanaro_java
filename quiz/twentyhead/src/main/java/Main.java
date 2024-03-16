import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int answer = random.nextInt(100)+1;
        while (true) {
            System.out.println("번호를 입력하세요.");
            int user = sc.nextInt();
            if (user == answer) {
                System.out.println("정답입니다.");
                sc.close();
                break;
            }
            if (user < answer) {
                System.out.println("번호가 정답보다 작습니다.");
            }
            if (user > answer) {
                System.out.println("번호가 정답보다 큽니다.");
            }
        }


    }
}

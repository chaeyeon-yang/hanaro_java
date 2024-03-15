import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 텍스트 야구 게임
        Random random = new Random();

        int player = 1;
        int outCount = 0;

        System.out.println("게임시작!");

        while (outCount < 3) {
            System.out.printf("%d번 타자 %n", player);
            int ballCount = 0;
            int strikeCount = 0;
            while (true) {
                if (ballCount == 4) {
                    System.out.println("1루 진루!");
                    player++;
                    break;
                }
                if (strikeCount == 3) {
                    System.out.println("삼진 아웃!");
                    outCount += 1;
                    player++;
                    break;
                }
                if (ballCount < 4 || strikeCount < 3) {
                    int ball = random.nextInt(2);
                    if (ball == 0) {
                        strikeCount += 1;
                        System.out.println("스트라이크!");
                    } else {
                        ballCount += 1;
                        System.out.println("볼~");
                    }
                }
            }

        }
        System.out.println("게임종료!");


    }
}


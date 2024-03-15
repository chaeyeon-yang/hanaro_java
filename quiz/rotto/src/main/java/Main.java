import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        boolean checkNum[] = new boolean[47];

        int cnt = 0;
        while (cnt<6) {
            // 1부터 46까지의 å난수 발생
            int randomNum = random.nextInt(46)+1;
            if (!checkNum[randomNum]) {
                checkNum[randomNum] = true;
                cnt++;
                System.out.printf("%d ",randomNum);
            } else {
                System.out.printf("%d(중복발생! 재추첨) ", randomNum);
            }
        }
    }

}

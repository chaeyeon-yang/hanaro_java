import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int rottoNum[] = new int[6];
        boolean checkNum[] = new boolean[46];

        int cnt = 0;
        while (rottoNum.length<6) {
            // 1부터 46까지의 난수 발생
            int randomNum = random.nextInt(46)+1;
            if (!checkNum[randomNum]) {
                rottoNum[cnt] = randomNum;
                cnt++;
            } else {
                System.out.println("(중복발생! 재추첨)");
            }
        }
    }

}

package loop;

public class Loop2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0; i<10; i++) {
            sum += 1;
        }
        System.out.println(sum);
        System.out.println("------------------");
        // while문으로 변경
        int sum2 = 0;
        int i = 0;
        while (i<10) {
            sum2 += i;
            i++;
        }
        System.out.println(sum2);
    }
}

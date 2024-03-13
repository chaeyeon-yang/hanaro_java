import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("월요일(1) 화요일(2) 수요일(3) 목요일(4) 금요일(5) 토요일(6) 일요일(7)");
        int day = sc.nextInt();

        if (goWork(day)) {
            System.out.println("oh my god");
        } else {
            System.out.println("enjoy");
        }
    }

    private static boolean goWork(int day) {
        return day == 1 || day == 3 || day ==5 || day == 7;
    }
}

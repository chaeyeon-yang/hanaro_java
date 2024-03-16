import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 괄호의 개수
        Scanner sc = new Scanner(System.in);
        System.out.println("괄호로 이루어진 문자열을 입력해주세요.(길이 100,000 이하)");

        String bracket = sc.next();
        int openB = 0;
        int closeB = 0;
        for (int i = 0; i < bracket.length(); i++) {
            if (bracket.charAt(i) == '(') {
                openB += 1;
            } else {
                closeB += 1;
            }
        }
        System.out.println(openB+" "+closeB);
        sc.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 자리 배치
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        Arrays.sort(heights);

        for (int j = 0; j < heights.length; j++) {
            if ((j+1)%c == 0) {
                System.out.println();
            } else  {
                System.out.print(heights[j]+" ");
            }
        }
    }
}

package array;

public class Array6 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(a.length);
        System.out.println(a[0].length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("[%d][%d]: %d",i,j,a[i][j]);
            }
        }

        for (int []ar:a) {
            for(int num: ar) {
                System.out.println(num+" ");
            }
        }
    }
}

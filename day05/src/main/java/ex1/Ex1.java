package ex1;

public class Ex1 {
    public static void main(String[] args) {
        int i = 10/2;
        System.out.println(i); // 런타임 에러 발생
        String str = "1000";
        int num = 0;
        try{
            num = Integer.parseInt(str);
            System.out.println(num);
        } catch(Exception e) {
            System.out.println("입력값이 이상합니다.");
//            e.printStackTrace();
        }

        int arr[] = {1,2,3};
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

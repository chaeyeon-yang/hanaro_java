package ex1;

public class Ex4 {
    public static void main(String[] args) {
        int i = 10/2;
        System.out.println(i); // 런타임 에러 발생
        String str = "1.000";
        int num = 0;
        try{
            num = Integer.parseInt(str);
            System.out.println(num);
            int result = 10/0;
        }
        catch(NumberFormatException | ArithmeticException e) {
            System.out.println("입력값이 이상합니다.");
//            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("끝");
        }
    }
}

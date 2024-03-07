package variable;

public class Variable2 {
    public static void main(String[] args) {
        int a = 10;
        String str1 = "abc"; // reference 형 변수
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = new String("abc");

        // str1, str3는 주소가 같고 -> String pool. 주소 참조
        // str2, str4는 주소가 다르다 -> Heap

        if (str1 == str3) {
            System.out.println("OK");
        }
        if (str1.equals(str3)) {
            System.out.println("OK2");
        }

        str3 = "ab"; // string pool 에 새로 생성. 주소값이 str3에 덮어씌움
        str1 = "ab";

        String str5 = "10";
        String result = str5 + 1;
        System.out.println(result);

        int num = 100;
        String result2 = num+"";

    }
}

package variable;

public class Variable4 {
    public static void main(String[] args) {
        String str = "abcdefg";
        // 역순으로 char를 대문자로 출력하시오.
        str = str.toUpperCase();
        for (int i=str.length()-1; i>=0; i--) {
            System.out.println(str.charAt(i));
        }

//        char [] result = str.toUpperCase().toCharArray();
//        System.out.println(result[i]);
    }
}

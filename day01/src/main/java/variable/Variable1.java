package variable;

public class Variable1 {
    public static void main(String[] args) {
        // 정수
        int a = 10;
        byte a1 = 100;
        byte a2 = 100;
        byte a3 = (byte) (a1 + a2);
        System.out.println(a3);
        long a5 = 21500000000L; // 21억 넘는 값은 int로 인식이 안됨
        long a6 = 1150000000 + 1150000000;
        System.out.println(a6);

        char ch = 'A'; // character
        System.out.println((int)ch);

        char ch2 = '\u0042'; // unicode
        System.out.println(ch);

        char ch3 = 0xac00; // unicode 44032
        System.out.println(ch3);

        // 실수
        double d = 10;
        float f = 10.0F;
        // Boolean
        boolean b = true;
        System.out.println(a);
        System.out.println(d);
    }
}

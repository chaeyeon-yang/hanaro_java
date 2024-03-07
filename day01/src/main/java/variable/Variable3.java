package variable;

public class Variable3 {
    public static void main(String[] args) {
        String str = "myday0827@naver.com";

        // id와 domain을 출력하시오
        String id = str.substring(0, str.indexOf('@')).toUpperCase();
        String domain = str.substring(str.indexOf('@')+1, str.indexOf('.')).toUpperCase();
        System.out.printf("%s , %s", id, domain);
    }
}

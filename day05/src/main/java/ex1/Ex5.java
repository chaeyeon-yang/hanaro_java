package ex1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) {
        // 파일시스템에 있는 데이터를 자바 애플리케이션으로 가져옴
        InputStreamReader is = null;
        is = new InputStreamReader(System.in);
        try {
            System.out.println(is.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                Thread.sleep(2000);
                is.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }
}

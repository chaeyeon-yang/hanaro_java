package ex1;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Database connected ...");

        try {
            int i = 10/0;
        } catch (Exception e) {
            System.out.println("Database Error");
            return;
        } finally {
            System.out.println("Database closed ...");
        }
    }
}

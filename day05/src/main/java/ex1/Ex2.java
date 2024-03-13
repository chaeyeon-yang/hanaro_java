package ex1;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted...");
        }

        System.out.println("End");

        try {
            Class.forName("org.mysql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("File not found ...");
        }

    }
}

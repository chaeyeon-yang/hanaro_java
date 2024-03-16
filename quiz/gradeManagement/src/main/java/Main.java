import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            print();
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    insert();
                    break;
                case 2:
                    getAll();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    finish();
                    System.exit(0);
            }
        }
    }
    public static void print() {
        System.out.println("---------성적 관리 프로그램---------");
        System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
    }

    public  static void insert() {
        System.out.print("이름 입력 : ");
        String name = sc.next();
        System.out.print("국어점수 입력 : ");
        int langScore = sc.nextInt();
        System.out.print("영어점수 입력 : ");
        int engScore = sc.nextInt();
        System.out.print("수학점수 입력 : ");
        int mathScore = sc.nextInt();
        Student st = new Student(name, langScore, engScore, mathScore);
        students.add(st);
    }

    public static void getAll() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

    public static void search() {
        System.out.print("검색할 사람의 이름 : ");
        String name = sc.next();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                System.out.println(students.get(i).toString());
            }
        }
    }

    public static void update() {
        System.out.print("수정할 사람의 이름 : ");
        String name = sc.next();
        Student onNow = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                onNow = students.get(i);
            }
        }
        if (onNow == null) {
            System.out.println("학생 리스트에 없으므로 수정할 수 없습니다!");
        } else {
            System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 : ");
            int selectOption = sc.nextInt();
            int score;
            switch (selectOption) {
                case 1:
                    System.out.print("국어점수 수정: ");
                    score = sc.nextInt();
                    onNow.setLangScore(score);
                    break;
                case 2:
                    System.out.print("영어점수 수정: ");
                    score = sc.nextInt();
                    onNow.setEngScore(score);
                    break;
                case 3:
                    System.out.print("수학점수 수정: ");
                    score = sc.nextInt();
                    onNow.setMathScore(score);
                    break;
            }
        }

    }

    public static void delete() {
        System.out.print("삭제할 사람의 이름 : ");
        String name = sc.next();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
            }
        }
    }

    public static void finish() {
        System.out.println("종료!!");
    }
}

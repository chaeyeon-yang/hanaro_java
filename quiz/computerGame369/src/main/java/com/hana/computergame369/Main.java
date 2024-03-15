package com.hana.computergame369;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 40; i+=2) {
            String computer = formatNumber(i);
            System.out.printf("컴퓨터: %s %n", computer);
            System.out.print("나: ");
            String user = sc.nextLine();
            String answer = formatNumber(i+1);


            if (!user.equals(answer)) {
            System.out.println("answer: "+answer);
                System.out.println("컴퓨터 승!");
                System.out.println("게임종료");
                return;
            }
        }
        System.out.println("무승부!");
        System.out.println("게임종료");
    }

    public static String formatNumber(int num) {
        String number = String.valueOf(num);
        String resNumber = "";

        boolean is369 = false;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '3' || number.charAt(i) == '6' || number.charAt(i)=='9') {
                is369 = true;
                resNumber += 'X';
            }
        }
        if (!is369) {
            resNumber = number;
        }
        return resNumber;
    }
}

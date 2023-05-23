package org.example.chap01;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int number = scanner.nextInt();

        String numberString = number + "";
        char[] chars = numberString.toCharArray();

        int sum = 0;
        for (int i = 0; i < chars.length ; i++) {
            sum += chars[i] - '0';
            System.out.println(sum);
        }
        System.out.println("sum = " + sum);
    }
}

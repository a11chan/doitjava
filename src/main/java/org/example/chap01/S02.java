package org.example.chap01;

import java.util.Scanner;

public class S02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("시험 본 과목 수 입력");
        int count = sc.nextInt();

        int[] scoreArray = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("시험 본 과목 점수 입력");
            scoreArray[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        for (int i : scoreArray) {
            if (i > max) max = i;
            sum += i;
        }

        double average = sum * 100.0 / max / count;
        System.out.println("조정된 평균 = " + average);
    }
}

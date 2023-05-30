package org.example.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구간 합 구하기
public class S03 {

    public static void main(String[] args) throws IOException {
        //1번째 줄 입력 2건
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // 가로로 연속 데이터 입력에 용이(구분은 스페이스)
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int digitSize = Integer.parseInt(stringTokenizer.nextToken());
        int queryCount = Integer.parseInt(stringTokenizer.nextToken());

        //2번쨰 줄 입력(구간 합 대상이 되는 숫자들)
        long[] sum = new long[digitSize + 1]; // 1번 인덱스부터 사용하기 위함
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //숫자 목록 입력 저장

        for (int i = 1; i <= digitSize; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); //입력 받은 숫자 돌면서 구간합 배열 생성
        }

        for (int q = 0; q < queryCount; q++) { // 위에서 지정한 횟수만큼 구간합 도출 반복
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //구간합 범위(시작, 끝) 입력 받기
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sum[end] - sum[start - 1]);
        }
    }
}
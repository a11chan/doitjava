package org.example.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //재료의 갯수
        int M = Integer.parseInt(br.readLine()); //갑옷이 되는 번호
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0; // A[0] -> min
        int j = N - 1; // A[N-1} -> max

        while (i < j) {
            if (A[i] + A[j] < M) i++;
            else if(A[i] + A[j] > M) j--;
            else {
                count++;
                i++; j--;
            }
        }

        System.out.println(count);
    }
}
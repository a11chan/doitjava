package org.example.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S05_Annotation {
    public static void main(String[] args) throws IOException {

        //키보드로부터 입력 받는 버퍼리더 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //재료 갯수를 입력 받아 int로 저장
        int N = Integer.parseInt(br.readLine());
        //갑옷이 되는 숫자(재료 2개 숫자의 합)를 입력 받아 int로 저장
        int M = Integer.parseInt(br.readLine());
        //재료 갯수에 해당하는 크기의 int 배열 선언
        int[] A = new int[N];
        //BufferedReader로 재료 갯수만큼 임의의 숫자 입력 받아 StringTokenizer에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        //재료 갯수만큼 Tokenizer 내부를 순회하면서 재료 숫자를 보관하는 배열에 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        //배열을 오름차순으로 정렬
        Arrays.sort(A);

        //갑옷이 되는 경우의 수를 누적할 변수 선언
        int count = 0;
        //첫 번째 포인터 선언
        int i = 0; // A[0] -> min
        //두 번째 포인터 선언, 재료 갯수 -1부터 시작
        int j = N - 1; // A[N-1} -> max

        //첫 번째 포인터가 두 번째 포인터보다 작을 동안 재료를 담은 배열 내부를 순회하며 반복문 실행
        while (i < j) {
            //제1 포인터가 가리키는 수와 제2 포인터가 가리키는 수의 합이 값옷이 되는 수보다 작으면
            //제1 포인터를 다음 숫자로 이동
            if (A[i] + A[j] < M) i++;
            //제1 포인터와 제2 포인터의 숫자 합이 갑옷이 되는 수보다 크면 제2 포인터를 배열의 왼쪽으로 이동
            else if(A[i] + A[j] > M) j--;
            //위 두 경우가 아니면 두 포인터가 가리키는 수의 합이 갑옷이 되는 수와 일치한다는 뜻이므로
            //count를 하나 누적하고, 제1 제2 포인터를 각각 오른쪽, 왼쪽으로 이동시킨다.
            else {
                count++;
                i++; j--;
            }
        }

        //위 반복문을 모두 수행한 뒤에 갑옷이 되는 경우의 수를 콘솔에 출력한다.
        System.out.println(count);
    }
}
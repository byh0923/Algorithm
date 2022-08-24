package twopointer;

import java.util.Scanner;

/**
 * 설명
 *
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 N=15이면
 *
 * 7+8=15
 *
 * 4+5+6=15
 *
 * 1+2+3+4+5=15
 *
 * 와 같이 총 3가지의 경우가 존재한다.
 *
 *
 * 입력
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 총 경우수를 출력합니다.
 * */
public class TwoPointer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;

        // 연속된 자연수는 N을 2로 나눈 숫자 + 1까지 탐색
        int arr[] = new int[N/2+1];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        int lt = 0;
        int sum = 0;

        for(int rt=0; rt<arr.length; rt++) {
            sum+=arr[rt];
            if(sum == N) {
                result++;
            }
            while(sum >= N) {
                sum-=arr[lt];
                lt++;
                if(sum == N) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

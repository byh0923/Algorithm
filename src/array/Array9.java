package array;

import java.util.Scanner;

/**
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 *
 *
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 *
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * */
public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[][] = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = Integer.MIN_VALUE;
        int sum1, sum2;

        for(int i=0; i<N; i++) {
            sum1 = 0;
            sum2 = 0;
            for(int j=0; j<N; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];

            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);

        }
        sum1 = 0;
        sum2 = 0;
        for(int i=0; i<N; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][N-i-1];
        }
        result = Math.max(result, sum1);
        result = Math.max(result, sum2);

        System.out.println(result);
    }
}

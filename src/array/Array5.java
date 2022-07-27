package array;

import java.util.Scanner;

/**
 * 에라토스테네스의 체
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * */
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;

        int ch[] = new int[N+1];

        for(int i=2; i<=N; i++) {
            if(ch[i] == 0){
                result++;
                for(int j=i; j<=N; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        System.out.println(result);
    }
}

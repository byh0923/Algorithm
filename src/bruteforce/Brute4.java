package bruteforce;

import java.util.Scanner;

/**
 * N개를 중복없이 M개 고르기
 * 15650
 * */
public class Brute4 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[M+1];
    }

    public static void rec_function(int k) {
        if(k == M+1) {
            for(int i=1; i<=M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        } else {
            int start = arr[k-1] + 1;
            for(int i=start; i<=N; i++) {
                arr[k] = i;
                rec_function(k+1);
                arr[k]=0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_function(1);
        System.out.println(sb.toString());
    }
}

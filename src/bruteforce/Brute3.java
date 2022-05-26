package bruteforce;

import java.util.Scanner;

/**
 * N개 중에 중복을 허용해서 M개를 고르는 법
 * boj15652
 * */
public class Brute3 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M+1];

    }

    public static void rec_function(int k) {
        if(k == M+1) {
            for(int i=1; i<=M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        } else {
            int start = arr[k-1];
            if(start == 0) {
                start = 1;
            }
            for(int i=start; i<=N; i++) {
                arr[k] = i;
                rec_function(k+1);
                arr[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_function(1);
        System.out.println(sb.toString());
    }

}

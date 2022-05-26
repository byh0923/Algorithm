package bruteforce;

import java.util.Scanner;

/**
 * boj15649
 * 중복 없이 순서있게 나열하는 문제
 * */
public class Brute2 {
    static int N, M;
    static int[] arr, used;
    static StringBuilder sb = new StringBuilder();

    public static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M+1];
        used = new int[N+1];

    }

    public static void rec_function(int k) {
        if(k == M+1) {
            for(int i=1; i<=M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for(int i=1; i<=N; i++) {
                if(used[i] == 1) {
                    continue;
                }
                arr[k] = i;
                used[i] = 1;
                rec_function(k+1);
                arr[k] = 0;
                used[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_function(1);
        System.out.println(sb.toString());
    }
}

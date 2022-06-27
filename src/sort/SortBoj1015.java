package sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortBoj1015 {

    static int N;
    static int[] P;
    static Elem[] B;
    static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem> {

        public int num, idx;

        @Override
        public int compareTo(Elem o) {
            // 1. num의 비내림차순
            // 2. num이 같으면 idx 오름차순
            if(num != o.num) {
                return num - o.num;
            }
            return idx - o.idx;
        }
    }
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        B = new Elem[N];
        P = new int[N];
        for(int i = 0; i < N; i++) {
            B[i] = new Elem();
            B[i].num = sc.nextInt();
            B[i].idx = i;
        }
    }

    static void pro() {
        Arrays.sort(B);
        for(int b_idx = 0; b_idx < N; b_idx++) {
            P[B[b_idx].idx] = b_idx;
        }
        for(int i=0; i<N; i++) {
             sb.append(P[i]).append(' ');
        }
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}

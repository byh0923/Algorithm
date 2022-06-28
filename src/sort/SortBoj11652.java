package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * long 사용
 * 같은 정보는 인접해있다.
 * */
public class SortBoj11652 {
    static long[] a;
    static int N;
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new long[N];
        for(int i = 1; i <= N; i++) {
            a[i] = sc.nextLong();
        }
    }
    static void pro() {
        Arrays.sort(a);

        long mode = a[1];
        int modeCnt = 1;
        int curCnt = 1;

        for(int i=2; i<=N; i++) {
            if(a[i] == a[i-1]) {
                curCnt++;
            } else {
                curCnt = 1;
            }
            if(modeCnt < curCnt) {
                mode = a[i];
            }
        }
        System.out.println(mode);
    }
}

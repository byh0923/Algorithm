package bruteforce;

import java.util.Scanner;

/**
 * 부분 수열의 합
 * -7 -3 -2 5 8
 * => -2 -2 5
 * 중복o 순서o
 * * */
public class BruteBoj1182 {
    static int N, S, ans;
    static int[] nums;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        nums = new int[N+1];
        for(int i=1; i<=N; i++) {
            nums[i] = sc.nextInt();
        }
    }
    static void rec_func(int k, int value) {
        if (k == N + 1) {
            if (value == S) {
                ans++;
            }
        } else {
            rec_func(k + 1, value + nums[k]);
            rec_func(k + 1, value);
        }

    }

    public static void main(String[] args) {
        input();
        rec_func(1, 0);
        if(S==0) {
            ans--;
        }
        System.out.println(ans);
    }

}

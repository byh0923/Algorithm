package bruteforce;

import java.util.Scanner;

/**
 * 연산자 끼워넣기
 * */
public class BruteBoj14888 {
    static int N, max, min;
    static int[] nums, operator;
    static StringBuilder sb = new StringBuilder();

    public static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nums = new int[N+1];
        operator = new int[5];
        for(int i=1; i<=N; i++){
            nums[i] = sc.nextInt();
        }
        for(int i=1; i<=4; i++) {
            operator[i] = sc.nextInt();
        }
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }
    public static int calc(int oper1, int oper, int oper2) {
        if(oper == 1) {
            return oper1 + oper2;
        } else if(oper == 2) {
            return oper1 - oper2;
        } else if(oper == 3) {
            return oper1 * oper2;
        } else {
            return oper1 / oper2;
        }
    }
    public static void rec_function(int k, int value) {
        if(k == N) {
            max = Integer.max(max, value);
            min = Integer.min(min, value);
        } else {
            for(int i=1; i<=4; i++) {
                if(operator[i] >= 1) {
                    operator[i]--;
                    rec_function(k+1, calc(value, i, nums[k+1]));
                    operator[i]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_function(1, nums[1]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }

}

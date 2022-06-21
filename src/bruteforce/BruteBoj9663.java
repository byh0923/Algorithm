package bruteforce;

import java.util.Scanner;

/**
 * N Queen 굉장히 유명한 백트레킹 문제
 * 하나의 행에 무조건 퀸 하나가 와야한다
 * 중복o 순서o
 * 1. 불필요한 탐색 때문에 시간 복잡도가 초과함
 * 2. => 가능하지 않은 위치는 아예 놓지 않도록 변경(완전탐색을 시도도 하지 않는다)
 * */
public class BruteBoj9663 {
    static int N, ans;
    static int[] col;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        col = new int[N+1];

    }
    static boolean attackable(int r1, int c1, int r2, int c2) {
        if(c1 == c2) {
            return true;
        }
        if(r1-c1 == r2-c2) {
            return true;
        }
        if(r1+c1 == r2+c2) {
            return true;
        }
        return false;
    }

    static void rec_function(int row) {
        if(row == N+1) {
            ans++;
        } else {
            for(int c=1; c<=N; c++) {
                boolean possible = true;
                for(int i=1; i<=row; i++) {
                    if(attackable(row, c, i, col[i])) {
                        possible = false;
                        break;
                    }
                }
                if(possible) {
                    col[row] = c;
                    rec_function(row+1);
                    col[row] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_function(1);
        System.out.println(ans);
    }
}

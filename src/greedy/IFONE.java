package greedy;

import java.util.Scanner;

/** *
 * 1이 될 때까지
 *
 */
public class IFONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;
        while(N != 1) {
            if(N % K == 0) {
                N /= K;
            } else {
                N--;
            }
            result++;

        }
        System.out.println(result);
    }
}

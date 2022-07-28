package array;

import java.util.Scanner;

/**
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 *
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 *
 * 첫 자리부터의 연속된 0은 무시한다.
 * */
public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] arr = new String[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.next();
        }

        int[] reversArr = new int[N];

        for(int i=0; i<N; i++) {
            StringBuilder sb = new StringBuilder(arr[i]).reverse();
            reversArr[i] = Integer.parseInt(sb.toString());
        }

        for(int i=0; i<N; i++) {
            int cnt = 0;

            for(int j=2; j<=reversArr[i]/2; j++) {
                if(reversArr[i] % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 0 && reversArr[i] != 1) {
                System.out.print(reversArr[i] + " ");
            }
        }


    }
    public static void reversInteger() {
        // res = res * 10 + t;
    }
}

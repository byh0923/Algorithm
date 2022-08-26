package hash;

import java.util.*;

/**
 * 설명
 *
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 *
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 *
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 *
 *
 * 출력
 * */
public class Hash5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int K = sc.nextInt();

        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int t=j+1; t<N; t++) {
                    set.add(arr[i] + arr[j] + arr[t]);
                }
            }
        }

        int cnt = 0;

        for(int x : set) {
            cnt++;
            if(cnt==K) {
                result = x;
                break;
            } else {
                result = -1;
            }

        }
        System.out.println(result);
    }
}

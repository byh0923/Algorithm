package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 설명
 *
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 *
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 *
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 *
 *
 * 출력
 * */
public class TwoPointer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int M = sc.nextInt();
        int[] b = new int[M];

        for(int i=0; i<M; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);

        List<Integer> result = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1<N && p2<M) {
            if(a[p1] == b[p2]) {
                result.add(a[p1++]);
                p2++;
            } else if(a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        result.forEach(item -> System.out.print(item + " "));
    }
}

package twopointer;

import java.util.*;

/**
 * 1. 두 배열 합치기
 * 설명
 *
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 *
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 *
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 *
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 * */
public class TwoPointer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] b = new int[M];

        for(int i=0; i<M; i++) {
            b[i] = sc.nextInt();
        }

        List<Integer> result = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1 < N && p2 < M) {
            if(a[p1] < b[p2]) {
                result.add(a[p1++]);
            } else {
                result.add(b[p2++]);
            }
        }
        while(p1 < N) {
            result.add(a[p1++]);
        }
        while(p2 < M) {
            result.add(b[p2++]);
        }

        result.stream().forEach(item -> System.out.print(item + " "));
    }
}

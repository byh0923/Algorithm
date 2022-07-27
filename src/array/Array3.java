package array;

import java.util.Scanner;

/**
 * 가위 바위 보 문제
 * N번의 게임을 해서 A가 이기면 A 출력
 * B가 이기면 B 출력, 비길 경우 D 출력
 * 1: 가위 2:바위 3:보
 * */
public class Array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int arr1[] = new int[N];
        int arr2[] = new int[N];

        for(int i =0; i<N; i++) {
            arr1[i] = scan.nextInt();
        }
        for(int i =0; i<N; i++) {
            arr2[i] = scan.nextInt();
        }

        for(int i=0; i<N; i++) {
            // 비긴 경우
            if(arr1[i] == arr2[i]) {
                System.out.println("D");
            } else if(arr1[i] == 1 && arr2[i] == 3) {
                System.out.println("A");
            } else if(arr1[i] == 2 && arr2[i] == 1) {
                System.out.println("A");
            } else if(arr1[i] == 3 && arr2[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }

    }
}

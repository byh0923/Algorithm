package doitbook.chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class 백준1940_주몽 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N+1];

        for (int i=1; i<=N; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        int start_index = 1;
        int end_index = N;

        while(start_index < end_index) {
            if(arr[start_index] + arr[end_index] < M) {
                start_index++;
            } else if (arr[start_index] + arr[end_index] > M) {
                end_index--;
            } else {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);

    }
}

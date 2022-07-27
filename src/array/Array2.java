package array;

import java.util.Scanner;
/**
 * 키 별로 세우고 앞에서 선생님이 볼 수 있는 학생
 * */
public class Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = scan.nextInt();
        }

        int result = 1;
        int max = arr[0];
        for(int i=1; i<N; i++) {
            if(arr[i] > max) {
                result++;
                max = arr[i];
            }
        }
        System.out.println(result);

    }
}

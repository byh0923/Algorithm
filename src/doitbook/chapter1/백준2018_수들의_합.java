package doitbook.chapter1;

import java.util.Scanner;

public class 백준2018_수들의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int start_index = 1;
        int end_index = 1;
        int count = 1;
        int sum = 1;


        while(end_index != N) {
            if (sum < N) {
                end_index++;
                sum += end_index;
            } else if(sum > N) {
                sum -= start_index;
                start_index++;
            } else if(sum == N) {
                count++;
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }

}

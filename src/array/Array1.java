package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = scan.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int i=1; i<N; i++) {
            if(arr[i] > arr[i-1]) {
                list.add(arr[i]);
            }
        }

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}

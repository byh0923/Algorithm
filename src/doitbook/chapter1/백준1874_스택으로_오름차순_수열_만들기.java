package doitbook.chapter1;

import java.util.Scanner;
import java.util.Stack;

public class 백준1874_스택으로_오름차순_수열_만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        int num = 1;
        boolean result = true;
        // 8 4 3 6 8 7 5 2 1
        for(int i=0;i <arr.length; i++) {
            int su = arr[i];
            if(su >= num) {
                while(su >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n= stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if(result) {
            System.out.println(sb.toString());
        }

    }
}

package boj.stack;

import java.util.Scanner;
import java.util.Stack;

public class Boj10773 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++) {
            int temp = scan.nextInt();
            if(temp == 0) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }

        result = stack.stream().mapToInt(x -> x).sum();

        System.out.println(result);
    }

}

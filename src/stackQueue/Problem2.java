package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {
    public String solution(String input) {
        String result = "";

        Stack<Character> stack = new Stack<>();

        for (Character x : input.toCharArray()) {
            if(x != ')') {
                stack.push(x);
            } else {
                while(stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }

        for(int i=0; i<stack.size(); i++) {
            result += stack.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Problem2 pb = new Problem2();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(pb.solution(input));
    }
}

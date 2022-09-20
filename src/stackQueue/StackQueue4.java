package stackQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 설명
 *
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 *
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 *
 *
 * 입력
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 *
 * 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 *
 *
 * 출력
 * */
public class StackQueue4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tmp.length(); i++) {
            if(Character.isDigit(tmp.charAt(i))) {
                stack.push(tmp.charAt(i) - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(tmp.charAt(i) == '+') {
                    stack.push(lt+rt);
                } else if(tmp.charAt(i) == '-') {
                    stack.push(lt - rt);
                } else if(tmp.charAt(i) == '*') {
                    stack.push(lt * rt);
                } else if(tmp.charAt(i) == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        System.out.println(stack.get(0));
    }
}

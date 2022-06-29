package javaalgorithm;

import java.util.Scanner;
/** 
 * 알파벳만 뒤집기
 * isAlphabetic이라는 메서드 있음
 * */
public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] s = input.toCharArray();
        int lt = 0;
        int rt = input.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String result = String.valueOf(s);

        System.out.println(result);
    }
}

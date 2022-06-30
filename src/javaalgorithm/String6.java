package javaalgorithm;

import java.util.Scanner;

/**
 * 중복문자 제거
 * */
public class String6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String result = "";

        for(int i=0; i<input.length(); i++) {
            if(input.indexOf(input.charAt(i))==i) {
                result+=input.charAt(i);
            }
        }
        System.out.println(result);
    }
}

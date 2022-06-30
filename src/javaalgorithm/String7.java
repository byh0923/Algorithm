package javaalgorithm;

import java.util.Locale;
import java.util.Scanner;

/**
 * 회문 문자열: 앞에서 읽을 때나 뒤에서 읽을 떄나 같은 문자열
 * */
public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();

        int len = input.length();

        String result = "YES";

        for(int i=0; i<len/2; i++) {
            if(input.charAt(i) != input.charAt(len-i-1)) {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}

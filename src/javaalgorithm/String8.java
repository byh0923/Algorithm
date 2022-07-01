package javaalgorithm;

import java.util.Locale;
import java.util.Scanner;

/**
 * 팰린드롬인지 확인
 * : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 * 정규식 사용
 * * */
public class String8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase().replaceAll("[^A-Z]", "");

        String result = "NO";

        String temp = new StringBuilder(input).reverse().toString();
        if(input.equals(temp)) {
            result = "YES";
        }
        System.out.println(result);
    }
}

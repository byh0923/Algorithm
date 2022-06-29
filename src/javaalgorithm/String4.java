package javaalgorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 *
 * StringBuilder에 reverse 메소드 있음
 * */
public class String4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] words = new String[N];
        String[] revers = new String[N];
        for(int i=0; i<N; i++) {
            words[i] = scan.next();
            revers[i] = "";
        }

        for(int i=0; i<words.length; i++) {
            for(int j=words[i].length()-1; j>=0; j--) {
                revers[i]+=words[i].charAt(j);
            }
        }

        for(String item : revers) {
            System.out.println(item);
        }
    }
    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i <n; i++) {
            str[i] = sc.next();
        }
        ArrayList<String> answer = new ArrayList<>();
        for(String item : str) {
            String temp = new StringBuilder(item).reverse().toString();
        }
    }

    public static void solution3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i <n; i++) {
            str[i] = sc.next();
        }
        ArrayList<String> answer = new ArrayList<>();
        for(String item : str) {
            char[] s = item.toCharArray();

        }
    }

}

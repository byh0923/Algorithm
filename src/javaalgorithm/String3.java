package javaalgorithm;

import java.util.Scanner;
/**
 * 문장은 nextLine으로 받아라..
 * */
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");
        int length = 0;
        String result = "";


        for(int i=0; i<words.length; i++) {
            if(words[i].length() > length) {
                length = words[i].length();
                result = words[i];
            }
        }
        System.out.println(result);
    }

    public void solution2() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=input.indexOf(' '))!=-1) {
            String tmp = input.substring(0, pos);
        }
    }
}

package javaalgorithm;

import java.util.Locale;
import java.util.Scanner;
/** 
 * 문자 찾기
 * */
public class String1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String base = sc.next().toUpperCase();
        char compare = sc.next().charAt(0);
        compare = Character.toUpperCase(compare);

        int cnt = 0;

        for(int i=0; i<base.length(); i++) {
            if(base.charAt(i) == compare) {
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}

package javaalgorithm;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String base = sc.next();
        String result = "";

        for(int i=0; i<base.length(); i++) {
            if(Character.isLowerCase(base.charAt(i))) {
                result+=Character.toUpperCase(base.charAt(i));
            } else {
                result+=Character.toLowerCase(base.charAt(i));
            }
        }
        System.out.println(result);
    }
}

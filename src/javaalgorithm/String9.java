package javaalgorithm;

import java.util.Scanner;

/**
 * 숫자만 추출
 * x>=48 && x<=57
 * */
public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            // 1 번
            if(arr[i]>=48 && arr[i] <=57) {
                result = result * 10 + (arr[i] - 48);
            }

            // 2번
            if(Character.isDigit(arr[i])) {

            }

        }
        System.out.println(result);
    }
}

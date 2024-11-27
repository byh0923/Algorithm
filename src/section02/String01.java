package section02;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next().toLowerCase();
        String findText = in.next().toLowerCase();

        int result = 0;

        for (int i=0; i<text.length(); i++) {
            if(String.valueOf(text.charAt(i)).equals(findText)) {
                result++;
            }
        }
        System.out.println(result);
    }
}

package doitbook.chapter1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 백준2164_카드게임 {
    public static void main(String[] args) {
        // 1 2 3 4 5 6
        // 2 3 4 5 6
        // 3 4 5 6 2
        // 4 5 6 2
        // 5 6 2 4
        // 6 2 4
        // 2 4
        // 4
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            queue.add(i);
        }

        while(queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}

package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10825
 * */
public class SortBoj10825 {
    static StringBuilder sb = new StringBuilder();
    static class Elem implements Comparable<Elem> {

        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(Elem o) {
            // 국어 점수가 내림차순
            if(korean != o.korean) {
                return o.korean - korean;
            }
            // 영어 점수 오름차순
            if(english != o.english) {
                return english - o.english;
            }
            // 수학 점수 내림차순
            if(math != o.math) {
                return o.math - math;
            }
            return name.compareTo(o.name);
        }
    }

    static int N;
    static Elem[] a;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new Elem[N];

        for(int i=0; i<N; i++) {
            a[i] = new Elem();
            a[i].name = sc.next();
            a[i].korean = sc.nextInt();
            a[i].english = sc.nextInt();
            a[i].math = sc.nextInt();
        }
    }



    public static void main(String[] args) {
        input();
        Arrays.sort(a);
        for(int i=0; i<a.length; i++) {
            sb.append(a[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }
    /*static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem>{
        static String name;
        static int korean, english, math;

        @Override
        public int compareTo(Elem other) {
            if (korean != other.korean) return other.korean - korean;
            if (english != other.english) return english - other.english;
            if (math != other.math) return other.math - math;
            return name.compareTo(other.name);
        }
    }
    static int N;
    static Elem[] a;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = new Elem[N];

        for(int i=0; i<N; i++) {
            a[i] = new Elem();
            a[i].name = sc.next();
            a[i].korean = sc.nextInt();
            a[i].english = sc.nextInt();
            a[i].math = sc.nextInt();
        }
    }


    public static void main(String[] args) {
        input();
        Arrays.sort(a);
        for(int i=0; i<a.length; i++) {
            sb.append(a[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }*/


}

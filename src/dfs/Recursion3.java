package dfs;
/**
 * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
 * 예를 들면 5! = 5*4*3*2*1=120입니다.
 * */
public class Recursion3 {
    public int DFS(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Recursion3 recursion3 = new Recursion3();
        System.out.println(recursion3.DFS(5));
    }
}

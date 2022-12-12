package dfs;
/**
 * 재귀함수를 이용한 2진수 출력
 * */
public class Recursion2 {

    public void DFS(int a) {
        if(a==0) {
            return;
        } else {
            DFS(a/2);
            System.out.print(a%2 + " ");
        }
    }

    public static void main(String[] args) {
        Recursion2 recursion2 = new Recursion2();
        recursion2.DFS(11);
    }
}

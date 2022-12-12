package dfs;

public class Recursion {

    public void DFS(int n) {

        if(n==0) {
            return;
        } else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.DFS(3);
    }
}

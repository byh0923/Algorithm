package dfs;
/** 
 * 피보나치 수열 재귀로 짜기
 * */
public class Recursion4 {

    /** 
     * 매먼 n-2 n-1을 계산해서 부담스러움
     * */
    public int DFS(int n) {
        /**
         * 더 나은 방법을 위해 메모이제이션 사용
         * */
        if(fibo[n]>0) {
            return fibo[n];
        }
        if(n==1) {
            return fibo[n] = 1;
        } else if(n==2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }
    /** 
     * 해결하기 위해 추가 그래도 느림
     * */
    public static int[] fibo;
    


    public static void main(String[] args) {
        Recursion4 recursion4 = new Recursion4();
        int n = 45;
        fibo = new int[n+1];
        recursion4.DFS(n);
        for(int i=1; i<=n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}

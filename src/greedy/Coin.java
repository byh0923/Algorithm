package greedy;

import java.util.Scanner;

/**
 * 돈을 입력 받으면 1, 50, 100, 500원 동전을 가장 적게 지불하는 총 동전의 갯수를 구해라.
 * */
public class Coin {
    public int solution(int money) {
        int result = 0;

        int coins[] = {500, 100, 50, 1};

        for(int i = 0; i < coins.length; i++) {
            result += money / coins[i];
            System.out.println(coins[i] + "원 : " + money / coins[i]);
            money %= coins[i];
            System.out.println("남은 금액 : " + money);
        }
        System.out.println("총 동전 갯수 : " + result);
        return result;
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        coin.solution(money);

    }
}

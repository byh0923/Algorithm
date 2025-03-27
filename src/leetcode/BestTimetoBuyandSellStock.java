package leetcode;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //Input: prices = [7,1,5,3,6,4]
        for(int price : prices) {
            if(minPrice > price) {
                minPrice = price;
            } else if(price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

    }
}

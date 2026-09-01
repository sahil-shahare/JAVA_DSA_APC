public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int[] profit = { 7, 1, 5, 3, 6, 4 };
        buyAndSellStocks(profit);

    }

    public static void buyAndSellStocks(int[] price) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        System.out.println("Profit: " + maxProfit);
    }

}

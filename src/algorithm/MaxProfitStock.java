/**Suppose we could access yesterday's stock prices as an array, where:

*The indices are the time in minutes past trade opening time, which was 9:30am local time.
*The values are the price in dollars of Apple stock at that time.
*So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500.
*
*Write an efficient function that takes stockPricesYesterday and returns the best.
*/ 
public class MaxProfitStock{
	public int getMaxProfit(int[] stockPricesYesterday){
		if(stockPricesYesterday.length < 2){
			throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		}
		int minPrice = stockPricesYesterday[0];
		int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
		for(int i = 1; i < stockPricesYesterday.length ; i++){
			int currentPrice = stockPricesYesterday[i];
			int potentialProfit = currentPrice - minPrice;
			maxProfit = Math.max(maxProfit,potentialProfit);
			minPrice = Math.min(minPrice,currentPrice);
		}
		return maxProfit;
		}
	}
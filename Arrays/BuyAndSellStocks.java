package ArrayExecise;


public class BuyAndSellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,1}; // it is not keep decreasing so buy = 2 and sell =4
		// 7,6,4,3,1 // buy is keep decreasing so 
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
        int sell=0,buy=prices[0];
		for(int i=1;i<prices.length;i++)
		{
			if(buy>prices[i]) 
				buy=prices[i];
			
			sell = Math.max(sell, prices[i]-buy);
		}
		return sell;
    }
}

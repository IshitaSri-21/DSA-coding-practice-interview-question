class Solution {
    public int maxProfit(int[] prices) {
        int profit=0, cp=prices[0];
        for(int i=0;i<prices.length;i++){  
            if(prices[i]<cp){
                cp=prices[i];
            }
            else if (prices[i]-cp>profit){
                profit=prices[i]-cp;
            }
        }
        return profit;
    }}
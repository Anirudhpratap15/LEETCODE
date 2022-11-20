class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE; //buy price 
        int ans = 0;
        int diff = 0;
        
        // we will itirate array  and store min value as buy price and then substract that min from current price if it is more then priveous price then store that 
        for(int i = 0; i < prices.length; i++){
            // store min value
            if(prices[i] < min){
                min = prices[i];
            }
            //buy-sell      as i is the current day price and min is the previous buy price 
            diff = prices[i] - min;
            if(ans < diff){
                ans = diff;
            }
        }
        return ans;
    }
}
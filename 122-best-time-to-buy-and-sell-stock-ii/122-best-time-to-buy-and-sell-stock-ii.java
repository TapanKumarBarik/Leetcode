class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        
        int n=prices.length;
        
        int curr=prices[0];
        
        for(int i=0;i<n;i++){
            
            if(prices[i]>curr){
                profit+=prices[i]-curr;
                curr=prices[i];
            }
            if(prices[i]<curr){
                curr=prices[i];
            }
        }
        
        return profit;
    }
}
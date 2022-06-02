class Solution {
    public int maxProfit(int[] prices) {
        
     int maxProfit=0;
        int currPrice=prices[0];
        
        
        int n=prices.length;
        
        for(int i=0;i<n;i++){
            
            if(prices[i]>currPrice){
                maxProfit=Math.max(maxProfit,prices[i]-currPrice);
            }
            if(prices[i]<currPrice){
                currPrice=prices[i];
            }
            
            
        }
        
        return maxProfit;
        
    }
}
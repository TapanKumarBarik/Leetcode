class Solution {
    public int pivotIndex(int[] nums) {
        
     //Approach 1
        
//         int n=nums.length;
        
//         int[]prefix=new int[n];
        
//         int[]suff=new int[n];
        
//         int sum=0;
        
//         for(int i=0;i<n;i++){
            
//             sum+=nums[i];
//             prefix[i]=sum;
            
//         }
        
//         sum=0;
//         for(int i=n-1;i>=0;i--){
//             sum+=nums[i];
//             suff[i]=sum;
            
//         }
        
//         for(int i=0;i<n;i++){
            
//             if(prefix[i]==suff[i]){
//                 return i;
//             }
//         }
        
        
//         return -1;
        
        
        
        
        //ApprocaH 2 
        
        int sum=0;
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
            sum+=nums[i];
        }
        
         int leftIndexSum=0;
        for(int i=0;i<n;i++){
            
            if(leftIndexSum==sum-leftIndexSum-nums[i]){
                return i;
            }
            leftIndexSum+=nums[i];
        }
        
        return -1;
    }
}
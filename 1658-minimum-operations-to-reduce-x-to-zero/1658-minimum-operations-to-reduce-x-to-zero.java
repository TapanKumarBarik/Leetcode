class Solution {
    public int minOperations(int[] nums, int x) {
        
        
        
          int totalSum = 0;
    for (int num : nums) totalSum += num;
    int targetSum = totalSum - x, currSum = 0, maxSize = -1;
    for (int l = 0, r = 0; r < nums.length; ++r) {
        currSum += nums[r];  
        while (l <= r && targetSum < currSum) {
            currSum -= nums[l++];
        }
        if (currSum == targetSum) maxSize = Math.max(maxSize, r - l + 1);
    }
    return maxSize == -1 ? -1 : nums.length - maxSize; 
        
        
//         int i=0;
//         int n=nums.length-1;
//         int m=n+1;
        
//         int sum=0;
//         while(i<=n){
            
//             if(sum==x){
//                 return i+m-n-1;
//             } 
//             if(nums[i]>=nums[n] ){
//                 if(sum+nums[i]<=x){
//                     sum+=nums[i];
//                     i++;
//                 }
//                 else if(sum+nums[n]<=x){
//                      sum+=nums[n];
//                     n--;
//                 }
//                 else{
//                     break;
//                 }
//             }
            
//             else{
//                  if(sum+nums[n]<=x){
//                     sum+=nums[n];
//                      n--;
//                 }
//                 else if(sum+nums[i]<=x){
//                     sum+=nums[i];
//                     i++;
//                 }
//                 else{
//                     break;
//                 }
//             }
            
//         }
        
//         return sum==x?nums.length:-1;
    }
}
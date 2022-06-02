class Solution {
    public int pivotIndex(int[] nums) {
        
        int n=nums.length;
        int []leftarr=new int[n];
        int []rightarr=new int[n];
        
        // left subarray
        for(int i=0;i<n;i++){
            
            if(i==0){
                leftarr[i]=nums[i];
            }
            else{
                leftarr[i]=leftarr[i-1]+nums[i];
            }
        }
        // right subarray
        for(int i=n-1;i>=0;i--){
            
            if(i==n-1){
                rightarr[i]=nums[i];
            }
            else{
                rightarr[i]=rightarr[i+1]+nums[i];
            }
        }
        
        //check
        
        for(int i=0;i<n;i++){
            
           if(leftarr[i]==rightarr[i]){
               return i;
           }
        }
        return -1;
    }
}
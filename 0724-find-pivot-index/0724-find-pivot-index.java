class Solution {
    public int pivotIndex(int[] nums) {
        
        //1,7,3,6,5,6
        //1,8,11,17,22,28
        //28,27,20,17,11,6
        
        //[2,1,-1]
        
       // 2,3,2
        //2,0,-1
        
        int n=nums.length;
        
        int[]prefix=new int[n];
        
        int[]suff=new int[n];
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            
            sum+=nums[i];
            prefix[i]=sum;
            
        }
        
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            suff[i]=sum;
            
        }
        
        for(int i=0;i<n;i++){
            
            if(prefix[i]==suff[i]){
                return i;
            }
        }
        
        
        return -1;
    }
}
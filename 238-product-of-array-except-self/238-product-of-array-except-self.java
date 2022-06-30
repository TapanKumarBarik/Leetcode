class Solution {
    public int[] productExceptSelf(int[] nums) {
     
        
        int n=nums.length;
        //left array
        
        int []left=new int[n];
        
        int sum=1;
        for(int i=0;i<n;i++){
             sum*=nums[i];
            left[i]=sum;
            
        }
        
        //right array concept
        
        int []right=new int[n];
        
         sum=1;
        
        for(int i=n-1;i>=0;i--){
             sum*=nums[i];
            right[i]=sum;
            
        }
        
        int []arr=new int[n];
        
        arr[0]=right[1];
        arr[n-1]=left[n-2];
        
        
        for(int i=1;i<n-1;i++){
            arr[i]=left[i-1]* right[i+1];
        }
        
        // return left;
        //[1,2,6,24]
        
        //return right;
        //[24,24,12,4]
        
        return arr;
    }
}
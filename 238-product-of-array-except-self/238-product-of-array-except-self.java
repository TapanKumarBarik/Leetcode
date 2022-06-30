class Solution {
    public int[] productExceptSelf(int[] nums) {
     
        
        int n=nums.length;
        //left array
        
        int []left=new int[n];
       left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=nums[i]*left[i-1];
            
        }
        
        //right array concept
        
        int []right=new int[n];
        
       right[n-1]=nums[n-1];
        
        for(int i=n-2;i>=0;i--){
            
            right[i]=nums[i]*right[i+1];
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
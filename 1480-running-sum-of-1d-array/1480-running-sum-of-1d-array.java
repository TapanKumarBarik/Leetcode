class Solution {
    public int[] runningSum(int[] nums) {
        
        int n=nums.length;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            
            if(i==0){
                arr[i]=nums[i];
            }
            else{
                arr[i]=arr[i-1]+nums[i];
            }
            
        }
        return arr;
    }
}
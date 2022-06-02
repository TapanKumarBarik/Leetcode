class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(k>=0){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                arr[k]=nums[j]*nums[j];
                j--;
                k--;
            }
            else{
                arr[k]=nums[i]*nums[i];
                i++;
                k--;
            } 
        }
        return arr;
    }
}
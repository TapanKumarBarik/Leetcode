class Solution {
    public void moveZeroes(int[] nums) {
        
        int n=nums.length;
        
        int i=0;
        int index=0;
        
        while(i<n){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
            i++;
        }
        
        //index--;
        for(i=index;i<n;i++){
            nums[i]=0;
        }
    }
    
}
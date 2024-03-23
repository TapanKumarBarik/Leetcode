class Solution {
    public int majorityElement(int[] nums) {
        
        int vote =0;
        int num=nums[0];
        
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==num){
                vote++;
            }
            else{
                vote--;
            }
            
            if(vote<0){
                vote=0;
                num=nums[i];
            }
        }
        
        return num;
    }
}
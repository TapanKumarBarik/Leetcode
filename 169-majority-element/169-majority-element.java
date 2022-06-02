class Solution {
    public int majorityElement(int[] nums) {
        
        
        int vote=1;
        int curr=nums[0];
        int n=nums.length;
        
        int i=1;
        while(i<n){
            
            if(nums[i]==curr){
                vote++;
            }
              if(nums[i]!=curr){
                vote--;
            }
            
            if(vote==0){
                curr=nums[i];
                vote++;
            }
            
            i++;
        }
        return curr;
    }
}
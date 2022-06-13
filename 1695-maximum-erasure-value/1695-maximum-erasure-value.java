class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashSet<Integer>set=new HashSet();
        
        int i=0;
        int j=0;
        int sum=0;
        
        int curr=0;
        
        int n=nums.length;
        while(i<n){
            if(set.contains(nums[i])){ 
             while(j<n && set.contains(nums[i]) ){
                    curr-=nums[j];
                 set.remove(nums[j]);
                     j++;
                }
            }
            else{
                set.add(nums[i]);
               curr+=nums[i];
                sum=Math.max(sum, curr);
                i++;
                
            }
        }
        
        return sum;
    }
}
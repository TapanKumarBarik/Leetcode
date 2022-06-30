class Solution {
    public int longestConsecutive(int[] nums) {
        
        
        HashSet<Integer>set=new HashSet();
        int res=0;
        
        for(int i:nums){
            set.add(i);
        }
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i]-1)){
            int curr=nums[i];
            int currCount=1;
            curr++;
            
            
            while(set.contains(curr)){
                currCount++;
                curr+=1;
            }
            res=Math.max(currCount, res);
            
        }
        }
        
        return res;
    }
}
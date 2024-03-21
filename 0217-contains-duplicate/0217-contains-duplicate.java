class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // TLE
        // for(int i=0;i<nums.length;i++){
        //     int num=nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         if(num==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        
        //APPROCAH 2 
        
        HashSet<Integer>set=new HashSet();
        
        for(int i=0;i<nums.length;i++){
            
            if(set.contains(nums[i])){
                return true;
            }
            
            set.add(nums[i]);
        }
        
        return false;
    }
}
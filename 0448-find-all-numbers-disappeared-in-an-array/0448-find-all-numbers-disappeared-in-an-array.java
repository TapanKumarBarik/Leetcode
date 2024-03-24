class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        
        
        List<Integer>list=new ArrayList();
        
        
        for(int i=0;i<nums.length;i++){
            
           while(nums[nums[i]-1]!=nums[i]){
                //swap
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        
        return list;
    }
}
//[4,3,2,7,8,2,3,1]
//[8,3,2,7,4,2,3,1]
//[1,3,2,7,4,2,3,0]
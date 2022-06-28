class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer,Integer>map=new HashMap();
        
        int []arr=new int[2];
        
        for(int i=0;i<nums.length;i++){
            
            int search=target-nums[i];
            
            if(map.containsKey(search)){
                
                arr[0]=map.get(search);
                arr[1]=i;
                break;
            }
            
            map.put(nums[i],i);
        }
        
        return arr;
    }
}
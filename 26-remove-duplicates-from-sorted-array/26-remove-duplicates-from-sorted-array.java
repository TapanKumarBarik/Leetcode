class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        TreeMap<Integer,Integer>map=new TreeMap();
        
        for(int i:nums){
            
            if(!map.containsKey(i)){
                map.put(i,1);
            }
        }
        
      
        int index=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
       nums[index]=entry.getKey() ;
            index++;
    }
        return map.size();
    }
}
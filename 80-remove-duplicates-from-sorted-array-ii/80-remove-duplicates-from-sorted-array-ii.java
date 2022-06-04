class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        TreeMap<Integer,Integer>map=new TreeMap();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            if(map.containsKey(nums[i])){
                
                if(map.get(nums[i])==2){
                    continue;
                }
                else{
                    map.put(nums[i],2);
                }
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        
        //
        int index=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           
            int m=entry.getKey();
            int k=map.get(m);
            for(int j=0;j<k;j++){
            nums[index]=m;
            index++;
            }
        }
        return index;
    }
}
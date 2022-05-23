class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        
        Arrays.sort(nums);
        
        List<List<Integer>>list=new ArrayList();
        
        solve(nums,list, new ArrayList(),new boolean[nums.length]);
        
        return list;
 
    }
    
    private void solve(int[]nums, List<List<Integer>>list, ArrayList<Integer>temp, boolean [] used){
        
        if(nums.length==temp.size()){
            list.add(new ArrayList(temp));
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(used[i] || i>0 && nums[i]==nums[i-1]&& !used[i - 1]){
                continue;
            }
            
            temp.add(nums[i]);
            used[i] = true; 
            solve(nums,list,temp,used );
            used[i] = false; 
            temp.remove(temp.size()-1);
        }
    }
}
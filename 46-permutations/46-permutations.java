class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>>list=new ArrayList();
        
        solve( list, new ArrayList(), nums);
        
        return list;
    }
    
    private void solve( List<List<Integer>>list,  ArrayList<Integer>temp, int[]nums){
        
        
        if(temp.size()==nums.length){
            list.add(new ArrayList(temp));
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(temp.contains(nums[i]))continue;
            
            temp.add(nums[i]);
            solve(list, temp, nums);
            temp.remove(temp.get(temp.size()-1));
            
        }
    }
}
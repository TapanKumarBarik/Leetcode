class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>>list=new ArrayList();
        
        solve(list, new ArrayList(), nums, target,0);
        
        return list;
        
    }
    
    private void solve(
    List<List<Integer>>list, ArrayList<Integer>temp, int[]nums, int target,int start){
        
        if(target<0)return;
        else if(target==0){
            list.add(new ArrayList(temp));
        }
        else{
            for(int i=start;i<nums.length;i++){
            
            temp.add(nums[i]);
            
            solve(list, temp,nums, target-nums[i],i);
            
            temp.remove(temp.size()-1);
             
        }
        }
        
    }
}
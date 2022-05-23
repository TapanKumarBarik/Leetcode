class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>>list=new ArrayList();
        
        solve(list, new ArrayList(), nums, target,0);
        
        return list;
    }
    
    private void solve(List<List<Integer>>list,ArrayList<Integer>temp,
                      int []nums,int target, int start){
        
        if(target<0){
            return;
        }
        else if(target==0){
            list.add(new ArrayList(temp));
        }
        else{
            
            for(int i=start;i<nums.length;i++){
                
                if(i>start && nums[i]==nums[i-1]){
                    continue;
                }
                temp.add(nums[i]);
                solve(list,temp,nums, target-nums[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
        
    }
}
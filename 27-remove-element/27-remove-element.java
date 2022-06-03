class Solution {
    public int removeElement(int[] nums, int val) {
      int n=nums.length;
        int[]arr=new int[n]; 
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                arr[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<index;i++){
            nums[i]=arr[i];
        }
        return index;
    }
}
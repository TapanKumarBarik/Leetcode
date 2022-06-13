class Solution {
    public int longestConsecutive(int[] nums) {
        
        
     
        HashSet<Integer>set=new HashSet();
        
        for(int i:nums){
            set.add(i);
        }
        int max=0;
      
         for (int i = 0; i < nums.length; i++) {
        int count = 1;

        // look left
        int num = nums[i];
        while (set.contains(--num)) {
          count++;
          set.remove(num);
        }

        // look right
        num = nums[i];
        while (set.contains(++num)) {
          count++;
          set.remove(num);
        }

        max = Math.max(max, count);
      }

      return max;
    }
}
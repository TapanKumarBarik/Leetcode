class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        int[]arr=new int[nums1.length];
        
        
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
            
        }
        
        for(int i=0;i<nums1.length;i++){
            
            int curr=nums1[i];
            int maxRes=-1;
            
            int index=map.get(curr);
            
            int n=nums2.length;
        
            
            for(int j=index;j<n;j++){
                if(nums2[j]>curr){
                    maxRes=nums2[j];
                    break;
                }
            }
            arr[i]=maxRes;
            
        }
        
        return arr;
    }
}
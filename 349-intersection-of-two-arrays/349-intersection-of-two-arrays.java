class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer>set=new HashSet();
        
        for(int num:nums1){
            set.add(num);
        }
        
        ArrayList<Integer>arr=new ArrayList();
        
        for(int num:nums2){
            
            if(set.contains(num)){
                arr.add(num);
                set.remove(num);
            }
        }
        
        int[]res=new int[arr.size()];
        
        for(int i=0;i<res.length;i++){
            res[i]=arr.get(i);
        }
        
        return res;
    }
}
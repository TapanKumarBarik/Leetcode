class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean>list=new ArrayList();
        
        int max=Integer.MIN_VALUE;
        
        for(int i:candies){
            max=Math.max(max,i);
        }
        
        for(int i:candies){
            
            if((extraCandies+i)>=max  ){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
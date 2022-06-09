class Solution {
    public List<String> simplifiedFractions(int n) {
        
        HashSet<Double>set=new HashSet();
        
        List<String>list=new ArrayList();
        
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
              if(!set.contains((double)i/j)){
                    set.add((double)i/j);
                list.add( i+"/"+j);
              }
            }
        }
        return list;
    }
}
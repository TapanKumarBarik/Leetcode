class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>>list=new ArrayList();
        
        solve(list, new ArrayList(), 1, 9,n,k);
        return list;
    }
    
    private void solve(List<List<Integer>>list,ArrayList<Integer>temp,
                       int start, int k, int n,int si
                      ){
        
        if(n<0)return;
        
        if(n==0){
           if(temp.size()==si){
                list.add(new ArrayList(temp));
           }
        }
        else{
            for(int i=start;i<=k;i++){
                
                temp.add(i);
                solve(list, temp, i+1, k, n-i,si);
                temp.remove(temp.size()-1);
            }
        }
    }
}
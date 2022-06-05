class Solution {
    HashSet<Integer>col=new HashSet();
        HashSet<Integer>di1=new HashSet();
        HashSet<Integer>di2=new HashSet();
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>>list=new ArrayList();
        
        solve(list, new ArrayList(), n, 0);
        
        return list;
    }
    private void solve(List<List<String>>list, ArrayList<String>temp, int n , int row){
        
        if(row==n){
            list.add(new ArrayList(temp));
            return;
        }
        
        else{
            
            for(int i=0;i<n;i++){
                
                if(col.contains(i) || di1.contains(row+i) || di2.contains(row-i)){
                    continue;
                }
                else{
                    
                    char[]arr=new char[n];
                    
                    Arrays.fill(arr,'.');
                    arr[i]='Q';
                    String s=new String(arr);
                    
                    temp.add(s);
                    col.add(i);
                    di1.add(row+i);
                    di2.add(row-i);
                    solve(list,temp, n,row+1);
                    
                    
                    temp.remove(temp.size()-1);
                    col.remove(i);
                    di1.remove(row+i);
                    di2.remove(row-i);
                    
                    
                }
            }
                
        }
    }
}
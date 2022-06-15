class Solution {
    public List<String> generateParenthesis(int n) {
        
        
        List<String>list=new ArrayList();
        
        solve(list, 0,0,n,new StringBuilder());
        
        return list;
    }
    
    private void solve(List<String>list, int open, int close, int n, StringBuilder curr){
        
        if(curr.length()==2*n){
            list.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append("(");
            solve(list, open+1, close, n, curr);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(")");
            solve(list, open, close+1, n, curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
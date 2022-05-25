class Solution {
    public List<List<String>> partition(String s) {
        
        
        List<List<String>>list=new ArrayList();
        
        solve(list, new ArrayList(), s, 0);
        
        return list;
    }
    private void solve(List<List<String>>list,List<String>temp,String s, int start){
        
        if(s.length()==start){
            
            list.add(new ArrayList(temp));
            return;
        }
        else{
            for(int i=start;i<s.length();i++){
                
                
                if( isPalinDrome(s, start,i)){
                    
                    temp.add(s.substring(start,i+1));
                    
                    solve(list, temp,s,i+1);
                    
                    temp.remove(temp.size()-1);
                }
            }
                
        }
    }
    private boolean isPalinDrome(String s, int start, int end){
        
        while(start<end){
            
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                end--;
                start++;
            }
        }
        return true;
    }
}
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character>st=new Stack();
        
        int n=s.length();
        for(int i=0;i<n;i++){
            
            if(s.charAt(i)=='('){
                st.push(')');
            }
            else  if(s.charAt(i)=='{'){
                st.push('}');
            }
            else  if(s.charAt(i)=='['){
                st.push(']');
            }
            else if( st.isEmpty() ||st.pop()!=s.charAt(i)){
                return false;
            }
        }
        
        return st.isEmpty();
    }
}
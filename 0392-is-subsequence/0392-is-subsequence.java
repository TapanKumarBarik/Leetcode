class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
        int i=0;
        
        if(s.length()==0){
            return true;
        }
        
        for(int k=0;k<t.length();k++){
            
            char ct=t.charAt(k);
            
            if(i<s.length()){
                if(s.charAt(i)==ct){
                
                    if(i==s.length()-1){
                        return true;
                    }
                    
                    i++;
              }
            }
            
            
        }
        
        return false;
    }
}
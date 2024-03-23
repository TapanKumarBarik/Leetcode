class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int m=s.length();
        
        int n=t.length();
        
        if(m!=n){
            return false;
        }
        
        
        //"egg"
        //"add"
        HashMap<Character, Character>map=new HashMap();
        
        for(int i=0;i<m;i++){
            
            char curr=s.charAt(i);
            
            if(map.containsKey(curr)){
                
                char c=map.get(curr);
                
                if(c!= t.charAt(i)){
                    return false;
                }
            }
            else{
                map.put(curr, t.charAt(i));
            }
        }
        
        //
         HashMap<Character, Character>map2=new HashMap();
        
        for(int i=0;i<m;i++){
            
            char curr=t.charAt(i);
            
            if(map2.containsKey(curr)){
                
                char c=map2.get(curr);
                
                if(c!= s.charAt(i)){
                    return false;
                }
            }
            else{
                map2.put(curr, s.charAt(i));
            }
        }
        
        return true;
    }
}
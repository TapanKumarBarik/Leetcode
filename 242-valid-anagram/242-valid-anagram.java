class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())return false;
        HashMap<Character, Integer>map=new HashMap();
        
        //store first value in map
        for(int i=0;i<s.length();i++){
            
            char curr=s.charAt(i);
            if(map.containsKey(curr)){
                int freq=map.get(curr);
                map.put(curr,freq+1);
            }
            else{
              map.put(curr,1);   
            }
        }
        
        //
        for(int i=0;i<t.length();i++){
             char curr=t.charAt(i);
            if(map.containsKey(curr)){
                int freq=map.get(curr);
                map.put(curr,freq-1);
                if(freq==1){
                    map.remove(curr);
                }
            }
            else{
             return false; 
            }
            
        }
        
        return map.size()==0?true:false;
    }
}
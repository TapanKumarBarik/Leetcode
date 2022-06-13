class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n=s.length();
        
        int m=t.length();
        
        if(m!=n)return false;
        
        HashMap<Character, Integer>map=new HashMap();
        
        for(int i=0;i<n;i++){
            
            char curr=s.charAt(i);
            
            if(map.containsKey(curr)){
                int freq=map.get(curr);
                map.put(curr, freq+1);
            }
            else{
                map.put(curr, 1);
            }
        }
        
        //
        for(int i=0;i<n;i++){
           char curr=t.charAt(i); 
            if(map.containsKey(curr)){
                int freq=map.get(curr);
                map.put(curr, freq-1);
                
                if(freq==1){
                    map.remove(curr);
                }
            }
            else{
              return false;
            }
        }
        
        return true;
    }
}
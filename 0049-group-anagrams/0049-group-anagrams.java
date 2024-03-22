class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        List<List<String>>res=new ArrayList();
        
        HashMap<String,List<String>>map=new HashMap();
        
        for(int i=0;i<strs.length;i++){
            
            String[]word=strs[i].split("");
            
            Arrays.sort(word);
            
            String word_2="";
            
            for(int j=0;j<word.length;j++){
                word_2+=word[j];
            }
            
            if(map.containsKey(word_2)){
                
                List<String>arr=map.get(word_2);
                arr.add(strs[i]);
                
                map.put(word_2,arr);
            }
            else{
                List<String>temp=new ArrayList();
                temp.add(strs[i]);
                
                map.put(word_2,temp);
            }
        }
        
        //traverse map
        
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
        res.add(entry.getValue());
        }
        
        return res;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<Integer>>map=new HashMap();
        
        List<List<String>>list=new ArrayList();
        
        for(int i=0;i<strs.length;i++){
            
            char[]arr=strs[i].toCharArray();
            
            Arrays.sort(arr);
              String s = "";
            for (char j : arr) {
                s += j;
            }
            
            if(map.containsKey(s)){
                List<Integer>l=map.get(s);
                l.add(i);
                map.put(s,l);
            }
            else{
                List<Integer>l=new ArrayList();
                l.add(i);
                 map.put(s,l);
            }
            
            

        }
        

        for (List<Integer> value : map.values()) {

            List<String>li=new ArrayList();

            for(int i=0;i<value.size();i++){
                li.add(strs[value.get(i)]);
            }
            list.add(li);
        }
        
        
        return list;
    }
}
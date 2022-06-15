class Solution {
     HashMap<Integer,String> map;
    private void solve(int i,String s,String digits,List<String> list){
        if(i==digits.length()){
            list.add(s);
            return;
        }
        
        int digit=(digits.charAt(i))-'0';
        String values=map.get(digit);
        for(int j=0;j<values.length();j++){
            solve(i+1,s+values.charAt(j),digits,list);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<String>();
        map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> list=new ArrayList<>();
        solve(0,"",digits,list);
        return list;
    }
}
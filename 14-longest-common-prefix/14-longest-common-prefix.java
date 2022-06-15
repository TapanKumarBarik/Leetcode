class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        int i=0;
        int n=strs.length-1;
        
        if(n==-1)return "";
        if(n==0)return strs[0];
        
        int m=Math.min(strs[0].length(), strs[n].length());
        String s="";
        while(i<m  ){
            
            if(strs[0].charAt(i)==strs[n].charAt(i)){
                s+=strs[n].charAt(i);
            }
            else{
                break;
            }
            i++;
        }
        return s;
    }
}
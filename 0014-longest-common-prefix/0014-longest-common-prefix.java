class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        Arrays.sort(strs);
        int n=strs.length;
        int k=strs[0].length();
        String res="";
        while(i<k){
            if(strs[0].charAt(i)==strs[n-1].charAt(i)){
                res+=strs[0].charAt(i);
                i++;
            }
            else{
                return res;
            }
        }
        
        return res;
    }
}
class Solution {
    public char findTheDifference(String s, String t) {
        
        int n=s.length();
      char xor=t.charAt(n);
        
        for(int i=0;i<n;i++){
            xor^=s.charAt(i);
            xor^=t.charAt(i);
        }
        return xor;
    }
}
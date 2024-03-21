class Solution {
    public boolean isAnagram(String s, String t) {
        
    int []arr=new int[26];
        
        int m=s.length();
        int n=t.length();
        
        
        if(m!=n){
            return false;
        }
        
        for(int i=0;i<n;i++){
          
            int ch=s.charAt(i)-97;
            
            arr[ch]++;
        }
        
           for(int i=0;i<n;i++){
          
            int ch=t.charAt(i)-97;
            
            arr[ch]--;
        }
        
        
           for(int i=0;i<26;i++){
          
           if(arr[i]!=0){
               return false;
           }
        }
        
        return true;
    }
}
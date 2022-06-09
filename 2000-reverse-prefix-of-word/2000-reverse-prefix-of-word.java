class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index=0;
        int n=word.length();
        
        for(int i=0;i<n;i++){
            
            if(word.charAt(i)==ch ){
                index=i;
                break;
            }
        }
        
        //reverse
        String res="";
        int j=index+1;
        for(int i=index;i>=0;i--){
            res+=word.charAt(i);
        }
        
        for(int i=j;i<n;i++){
            res+=word.charAt(i); 
        }
        
        return res;
    }
}
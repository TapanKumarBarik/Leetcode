class Solution {
    public void reverseString(char[] s) {
        
        int i=0;
        int n=s.length-1;
        
        while(i<n){
            swap(s, i, n);
            i++;
            n--;
        }
        
        
    }
    private void swap(char[]s, int i, int j){
        
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
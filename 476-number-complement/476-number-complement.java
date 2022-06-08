class Solution {
    public int findComplement(int n) {
         if(n==0) return 1;
        
        int result = 0;
        int i = 0;        
        while(n>0){
            if((n&1) == 0){
                result += 1<<i;
            }
            i++;
            n >>= 1;
        }
        
        return result;
    }
}
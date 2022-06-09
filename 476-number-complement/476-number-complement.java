class Solution {
    public int findComplement(int n) {
         if(n==0) return 1;
        
        int res = 0;
        while(res<n){
            res=(res<<1)|1;
        }
        
        return ~n & res;
    }
}
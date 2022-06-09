class Solution {
    public int bitwiseComplement(int n) {
        
      int num=0;
        if(n==0)return 1;
        while(num<n){
            num=(num<<1)|1;
        }
        
        return ~n & num;
    }
}
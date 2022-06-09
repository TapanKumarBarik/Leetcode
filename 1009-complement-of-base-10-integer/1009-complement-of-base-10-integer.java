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

/*
lets take the number is 5 i le 

1 0 1

after the loop num will be 

 1 1 1
 
 then ~n
 1 1 1 & 1 0 1
 
 
 return is 10 i e 2

*/
class Solution {
    public int getSum(int a, int b) {
        	//recursion
        
            int xor=a^b;
        int carry=a&b;
        if(carry==0)return xor;
        
        return getSum(xor, carry<<1);
    }
}
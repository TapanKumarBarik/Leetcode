class Solution {
    public boolean hasAlternatingBits(int n) {
       
        int flag=0;
       if(n%2==0){
           flag=0;
       }else{
           flag=1;
       }
        
        
        while(n>0){
            
            if(flag==0){
                
                if(  (n&1)==1 )return false;
                flag=1;
            }
            else{
                
                if(  (n&1)==0 )return false;
                flag=0;
            }
            
            n=n>>1;
        }
        return true;
        
    }
}
class Solution {
    public int maximum69Number (int num) {
        
       String s=""+num;
        
        String res="";
        int flag=0;
        
        for(int i=0;i<s.length();i++){
            
            if(flag==0 && s.charAt(i)=='6'){
                res+='9';
                flag=1;
            }
            else{
              res+=s.charAt(i);
                  
            }
        }
        
        //
        int nums=0;
        
         for(int i=0;i<s.length();i++){
             
             nums*=10;
             nums+=res.charAt(i)-'0';
         }
        return nums;
    }
}
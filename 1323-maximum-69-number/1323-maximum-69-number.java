class Solution {
    public int maximum69Number (int num) {
        
       String s=""+num;
        
      
        int flag=0;
         int nums=0;
        for(int i=0;i<s.length();i++){
             nums*=10;
            if(flag==0 && s.charAt(i)=='6'){
                 nums+=9;
                flag=1;
            }
            else{
               nums+=s.charAt(i)-'0';
                  
            }
        }
        
        return nums;
    }
}
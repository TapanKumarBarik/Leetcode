class Solution {
    public String addBinary(String a, String b) {
        
        
        
        if(a=="")return b;
        if(b=="")return a;
        int n=a.length();
        int m=b.length();
        
        int i=n-1;
        int j=m-1;
        
        int carry=0;
        
        String ans="";
        while(i>=0 && j>=0){
            
            int res=a.charAt(i)-'0';
            res+=b.charAt(j)-'0';
            i--;
            j--;
            res+=carry;
            ans+=res%2;
            carry=res/2;
        }
        
        while(i>=0){
             int res=a.charAt(i)-'0';
            i--;
            res+=carry;
              ans+=res%2;
            carry=res/2;
        }
        
        while(j>=0){
            
           int res=b.charAt(j)-'0';
            j--;
            res+=carry;
              ans+=res%2;
            carry=res/2;
        }
        
        if(carry!=0){
            ans+=carry;
        }
        String result="";
        
        for( i=ans.length()-1;i>=0;i--){
            result+=ans.charAt(i);
        }
        return result;
            
        
    }
}
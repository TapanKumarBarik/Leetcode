class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        
        Stack<Integer>st=new Stack();
        
        String s="";
        s+=k;
        
        int n=num.length-1;
        int m=s.length()-1;
        int carry=0;
        while(n>=0 && m>=0){
            int res=num[n];
            res+=s.charAt(m)-'0';
            res+=carry;
            st.push(res%10);
            carry=res/10;
            m--;
            n--;
        }
        
        while(n>=0){
            int res=num[n];
            res+=carry;
            st.push(res%10);
            carry=res/10;
            n--;
        }
         while( m>=0){
            int res=s.charAt(m)-'0';
            res+=carry;
            st.push(res%10);
            carry=res/10;
             m--;
        }
        
        if(carry!=0){
            st.push(carry);
        }
        
        List<Integer>list=new ArrayList();
        
        while(!st.isEmpty()){
            list.add(st.pop());
        }
          return list;
    }
}
// { Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
        
        
        
        HashSet<Integer>set=new HashSet<Integer>();
        
        long num=n;
        long num2=n*2;
        long num3=n*3;
        String s=""+num+num2+num3;
        
        for(int i=0;i<s.length();i++){
            
           if(s.charAt(i)=='0' )continue;
          if(set.contains(s.charAt(i)-'0') )return false;
                set.add(s.charAt(i)-'0');
         
            
        }
        
        return set.size()==9;
    }
}
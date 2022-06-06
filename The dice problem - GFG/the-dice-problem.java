// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            int ans  = ob.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int oppositeFaceOfDice(int N){
        // code here
        
        if(N==6)return 1;
        else if(N==1)return 6;
         else if(N==2)return 5;
       else if(N==5)return 2;
        else if(N==4)return 3;
       return 4;
        
    }
}
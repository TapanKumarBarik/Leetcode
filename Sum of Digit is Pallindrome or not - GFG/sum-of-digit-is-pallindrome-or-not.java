// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        
        int num=0;
        while(N>9){
            num+=N%10;
            N=N/10;
        }
        num+=N;
        
        String s="";
        s+=num;
        
        int i=0;
        int n=s.length()-1;
        
        while(i<n){
            if(s.charAt(i)!=s.charAt(n)){
                return 0;
            }
            i++;
            n--;
        }
        
        
        return 1;
    }
    
}
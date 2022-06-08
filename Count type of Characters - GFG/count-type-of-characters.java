// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here  
         int []count=new int[4];
        int temp=0,temp1=0,temp2=0,temp4=0;
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)>='0'&&s.charAt(i)<='9')
           {
              temp++; 
           }
           else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
           {
               temp1++;
           }
            else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
           {
               temp2++;
           }
            else 
            
           {
             temp4++;
           }
       }  
           for(int i=0;i<4;i++)
           {
               count[0]=temp1;
               count[1]=temp2;
               count[2]=temp;
               count[3]=temp4;
           }
            return count;
    }
}
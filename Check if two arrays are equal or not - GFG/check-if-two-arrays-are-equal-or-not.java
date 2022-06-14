// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        if(A.length!=B.length)return false;
        HashMap<Long,Long>map=new HashMap<Long,Long>();
        
        for(int i=0;i<A.length;i++){
            
            if(map.containsKey(A[i]) ){
                long freq=map.get(A[i]);
                map.put(A[i],freq+1);
            }
            else{
                map.put(A[i],(long)1);
            }
        }
        
        //
        
        for(int i=0;i<B.length;i++){
            
            if(map.containsKey(B[i]) ){
                long freq=map.get(B[i]);
                map.put(B[i],freq-1);
                if(freq==1){
                    map.remove(B[i]);
                }
            }
            else{
                return false;
            }
        }
        
        return map.size()==0?true:false;
        
    }
}
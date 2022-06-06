// { Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
         // Your code here
         int count=n;
         while(count!=0){
             
             int temp=n;
             while(temp!=0){
                for(int i=0;i<count;i++){
                System.out.print(temp);
                System.out.print(" ");
                
                } 
                temp--;
             }

              System.out.print("$");
              count--;
            
         }
    }
}
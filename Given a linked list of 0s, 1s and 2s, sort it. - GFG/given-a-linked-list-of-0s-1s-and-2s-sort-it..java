// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node zerohead = null, zerotail = null, onehead = null, onetail = null, twohead = null, twotail = null;
        boolean zeroPresent = false, onePresent = false, twoPresent = false;

        for(Node curr = head; curr != null; curr = curr.next)
        {
            if(curr.data == 0)
            {
                zeroPresent = true;
                if(zerohead == null)
                {
                    zerohead = curr;
                    zerotail = zerohead;
                }
                else {
                    zerotail.next = curr;
                    zerotail = zerotail.next;
                }
            }
            else if(curr.data == 1)
            {
                onePresent = true;
                if(onehead == null)
                {
                    onehead = curr;
                    onetail = onehead;
                }
                else {
                    onetail.next = curr;
                    onetail = onetail.next;
                }
            }
            else
            {
                twoPresent = true;
                if(twohead == null)
                {
                    twohead  = curr;
                    twotail = twohead ;
                }
                else {
                    twotail.next = curr;
                    twotail = twotail.next;
                }
            }
        }
        
        
        if(zeroPresent)
        {
            if(onePresent)
            {
                if(twoPresent)
                {
                    zerotail.next = onehead;
                    onetail.next = twohead;
                    twotail.next = null;
               
                }
                else
                {  
                    zerotail.next = onehead;
                    onetail.next = null;
                    return zerohead;
                }
            }
            else
            {
                if(twoPresent)
                {
                    zerotail.next = twohead;
                    twotail.next = null;
                
                }
                else
                {
                    zerotail.next = null;
                    
                }
            }
            return zerohead;
        }
        else
        {
            if(onePresent)
            {
                if(twoPresent)
                {
                    onetail.next = twohead;
                    twotail.next = null;
                }
                else
                {
                    onetail.next = null;
                }
                return onehead;
            }
            else
            {
                if(twoPresent)
                {
                    twotail.next = null;
                    return twohead;
                }
                else
                    return null;
            }
        }

    }
}




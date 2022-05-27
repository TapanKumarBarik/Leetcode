/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
         if(head==null || head.next==null){return null;}
        ListNode fast=head;
        ListNode slow=head;
        
        while(  slow!=null && fast!=null && fast.next!=null){
            
            
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow){
               break;
            }
        }
        
        if(slow!=fast)return null;
        slow=head;
		//now both slow and fast will do a single jump until slow==fast then break
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
		//now you can return slow or fast as booth are same
        return slow;
    }
}
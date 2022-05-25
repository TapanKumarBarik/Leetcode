/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        
        ListNode res=null;
        
        ListNode prev=res;
        
        while(head!=null){
            
            ListNode curr=new ListNode(head.val);
            
            curr.next=prev;
            prev=curr;
            head=head.next;
        }
        return prev;
        
    }
}
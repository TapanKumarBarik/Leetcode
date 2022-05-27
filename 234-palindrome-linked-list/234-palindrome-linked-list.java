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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow = reverse(slow);
        fast=head;
        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            
            fast=fast.next;
            slow=slow.next;
        }
        return true;
        
    }
    
    private ListNode reverse(ListNode head){
    ListNode prev=null;
        while(head!=null){
            ListNode curr=new ListNode(head.val);
            curr.next=prev;
            prev=curr;
            head=head.next;
        }
        return prev;
    }
}
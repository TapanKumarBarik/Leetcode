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
    public ListNode deleteDuplicates(ListNode head) {
     
        ListNode curr=new ListNode(0);
        ListNode d=curr;
        
        
        while(head!=null){
            
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                
            }
            else{
                d.next=head;
               d= d.next;
            }
            head=head.next;
        }
        
        d.next = null;
        return curr.next;
    }
}
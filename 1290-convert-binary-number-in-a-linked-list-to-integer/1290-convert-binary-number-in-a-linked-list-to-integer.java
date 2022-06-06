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
    public int getDecimalValue(ListNode head) {
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        
        int res=0;
        count--;
        
        while(head!=null){
            if(head.val!=0){
                res+=(int)Math.pow(2,count);
            }
            count--;
            head=head.next;
        }
        return res;
    }
}
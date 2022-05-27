/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
      /*  HashSet<ListNode>set=new HashSet();
        
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        
        while(headB!=null){
            
            if(set.contains(headB)){
                break;
            }
            headB=headB.next;
        }
        return headB;
        */
        
        ListNode a=headA;
        ListNode b=headB;
        
        int flag1=0;
        int flag2=0;
        while(headA!=headB){
            if(flag1>1 || flag2>1){
                return null;
            }
            
            headA=headA.next;
            headB=headB.next;
            if(headA==null){
                headA=b;
                flag1++;
            }
            if(headB==null){
                headB=a;
                flag2++;
            }
        }
        return headA;
    }
}
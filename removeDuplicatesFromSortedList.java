/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    
        if(head==null || head.next==null)
        return head;
        
        ListNode prev = head;
        ListNode cur = head;
    
        while(cur.next!=null){
            cur = cur.next;
            if(prev.val!=cur.val){
                prev.next = cur;           
                prev = cur;
            }
        }
        if(prev.val==cur.val) 
            prev.next=null;
        return head;
    }
}
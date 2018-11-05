/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    if(head==null || head.next==null)
        return head;
   
    ListNode temp = head;
    ListNode prev = head.next;
    ListNode current = head.next.next;

        while(current!=null){
            prev.next = temp;
            temp = prev;
            prev = current;
            current = current.next;
        }
            prev.next = temp;   
            head.next = null;
        return prev;
    }
}
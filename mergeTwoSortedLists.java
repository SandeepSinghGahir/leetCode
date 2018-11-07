/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode mergedNode = new ListNode(1);
        ListNode tmp =  mergedNode;
        while(l1!=null && l2!=null){
            
            if(l1.val>l2.val){
                tmp.next = l2;
                l2 = l2.next;                
            }
            else {
                tmp.next = l1;
                l1 = l1.next;                
            }
            tmp = tmp.next;                            
        }
        
        if(l1==null)
            tmp.next = l2;
        else if(l2==null)
            tmp.next = l1;
        return mergedNode.next;
    }
}
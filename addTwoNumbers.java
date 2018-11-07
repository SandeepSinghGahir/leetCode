/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                
        ListNode result = new ListNode(0);
        ListNode head = result;
        int carryFlag=0;
        int sum = 0;
        
        while(l1!=null || l2!=null || carryFlag!=0){ 
        ListNode current = new ListNode(0);
        sum=0;
            if(l1!=null){
                sum = l1.val;
                l1 = l1.next;
            }
                
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            
        current.val = (sum + carryFlag) % 10;
        carryFlag = (sum + carryFlag)/10;         
        result.next = current;
        result = result.next;
        }
       return head.next;
    }
}

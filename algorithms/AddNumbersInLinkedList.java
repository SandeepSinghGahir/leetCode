/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    ArrayList<Integer>  arrlist = new ArrayList<Integer>();    
    StringBuilder l1s = new StringBuilder();
    StringBuilder l2s = new StringBuilder();
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        while (l1!=null){
            l1s.append(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            l2s.append(l2.val);
            l2 = l2.next;
        }
        
        int sum = Integer.parseInt(l1s.toString()) + Integer.parseInt(l2s.toString());
        
        
        recursion(sum);
        
        Collections.reverse(arrlist);
        
        ListNode head = null;
        ListNode tail = null;
        for(int num : arrlist){
         if(head == null){
                head = new ListNode(num);
                tail = head;
         }
         else {
             tail.next = new ListNode(num);
             tail = tail.next;
         }
        }
        return head;
    }
    public void recursion(int number) {
	    if(number > 0) {
	        recursion(number/10);
	        arrlist.add(number%10);	     
	    }
    }
        
}

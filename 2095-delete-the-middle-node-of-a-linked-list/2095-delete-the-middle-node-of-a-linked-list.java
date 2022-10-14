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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode root = head;
        ListNode fast = head;
        
		
        while(fast!=null && fast.next!= null){
            head = head.next;
            fast = fast.next.next;
        }
		
		
        if(head.next!=null){
            head.val = head.next.val;
            head.next = head.next.next;
        } else {
            root.next = null;
        }
		
        return root;
    }
}
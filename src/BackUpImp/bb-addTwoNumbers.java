Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
做这种基本题的时候一定要仔细
public class Solution {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
        	return (l1 == null) ? l2 : l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;
        while(l1 != null && l2 != null) {
        	int digit = (l1.val + l2.val + carry) % 10;
        	carry = (l1.val + l2.val + carry) / 10;
        	ListNode temp = new ListNode(digit);
        	head.next = temp;
        	head = head.next;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        while(l1 != null) {
        	int digit = (carry + l1.val) % 10;
        	carry = (carry + l1.val) / 10;
        	ListNode temp = new ListNode(digit);
        	head.next = temp;
        	head = head.next;
        	l1 = l1.next;
        }
        while(l2 != null) {
        	int digit = (carry + l2.val) % 10;
        	carry = (carry + l2.val) / 10;
        	ListNode temp = new ListNode(digit);
        	head.next = temp;
        	head = head.next;
        	l2 = l2.next;
        }
        if(carry == 1) {
        	ListNode tail = new ListNode(1);
        	head.next = tail;
        }
        return dummy.next;
    }
}
}
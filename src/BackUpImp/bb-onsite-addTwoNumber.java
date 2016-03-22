/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//new Node at each time
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode next = new ListNode(val);
            head.next = next;
            head = next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int val = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            ListNode next = new ListNode(val);
            head.next = next;
            head = next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int val = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            ListNode next = new ListNode(val);
            head.next = next;
            head = next;
            l2 = l2.next;
        }
        if(carry == 1) {
            ListNode tail = new ListNode(1);
            head.next = tail;
            tail.next = null;
        }
        return dummy.next;
    }
}
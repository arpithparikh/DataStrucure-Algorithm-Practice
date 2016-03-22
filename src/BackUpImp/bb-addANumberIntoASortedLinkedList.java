add a number into a sorted linked list
public class Solution {
	public ListNode(ListNode head, int target) {
		if(head == null) {
			return new ListNode(target);
		}
		ListNode dummy = new ListNode(0);
		head = dummy;
		while(head.next != null) {
			if(head.next.val > target) {
				ListNode temp = new ListNode(target);
				temp.next = head.next;
				head.next = temp;
			}
			else {
				head = head.next;
			}
		}
		return dummy.next;
	}
}
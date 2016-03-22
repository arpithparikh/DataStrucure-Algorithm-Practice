public class Solution {
	ListNode head = new ListNode();
	public void push(int m) {
		ListNode next = new ListNode(m);
		ListNode runner = head;
		while(runner.next != null) {
			runner = runner.next;
		}
		runner.next = next;
		next.next = null;
	}
	public void pop() {
		ListNode runner = head;
		ListNode runner2 = head;
		while(runner.next != null) {
			runner2 = runner;
			runner = runner.next;
		}
		runner.next = null
	}
	public int peek(){
		ListNode runner = head;
		while(runner.next != null) {
			runner = runner.next;
		}
		return runner.val;
	}
}
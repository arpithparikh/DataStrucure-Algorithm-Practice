
public class reverseSecondHalf {
	public ListNode reverseSecondHalf(ListNode head) {
		if(head == null || head.next == null || head.next.next == null) {
			return head;
		}
		ListNode temp = head;
		int length = getLength(temp);
		if(length % 2 == 1) {
			ListNode prevMid = getPrevMid(head);
			ListNode newHead = prevMid.next;
			prevMid.next = null;
			newHead = doReverse(newHead);
			prevMid.next = newHead;
			return head;
		}
		else {
			ListNode mid = getMid(head);
			ListNode newHead = mid.next;
			mid.next = doReverse(newHead);
			return head;
		}
	}
	private ListNode getMid(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	private ListNode getPrevMid(ListNode head) {
		ListNode temp = head;
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			temp = slow;
			slow = slow.next;
		}
		return temp;
	}
	private ListNode doReverse(ListNode head) {
		ListNode prev = null;
		while(head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
	private int getLength(ListNode head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	public static void printout(ListNode head){
		while( head != null ){
			System.out.print(head.val + "->");
			head = head.next;
			if(head == null) {
				System.out.print("null");
			}
		}
	}
	public static void main(String[] args) {
		reverseSecondHalf s = new reverseSecondHalf();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		printout(node1);
		ListNode newNode = s.reverseSecondHalf(node1);
		printout(newNode);
	}
}
//Insertion of the List Node
class ListNode{
	
	int val;
	ListNode next;
	ListNode(int val){
	this.val = val;
	this.next = null;
	}
}

public class Solution{
	

	public ListNode insertionList(ListNode head){

		ListNode dummy = new ListNode(0);

		while(head!= null){

		ListNode node = dummy;

		while(node.next!=null && node.next.val < head.val){

			node = node.next;
		}

		ListNode temp = head.next;
		head.next = node.next;
		node.next = head;
		head = next;
		}
		return dummy.next;
	}
}
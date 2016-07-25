//delete Node in the the Middle of Singly Linked List 

public class Solution{
	
	public void deleteNode(ListNode node){
		node.val = node.next.val;
		node.next = npde.next.next;
		return ;
	}
}
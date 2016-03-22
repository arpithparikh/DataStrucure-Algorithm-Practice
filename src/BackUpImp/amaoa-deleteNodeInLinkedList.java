因为我们只给了要删除的node的信息，所以考虑用next的值去覆盖node的值然后相当于是删除node.next
public class Solution {
	public void deleteNode(ListNode node) {
		if(node == null || node.next == null) {
			return;
		}
		ListNode next = node.next;
		node.val = next.val;
		node.next = next.next;
	}
}
//Linked List Cycle
public class LinkedListCycle{
	public boolean hasCycle(ListNode head){

			Set<ListNode> set = new Set<ListNode>();

			while(head!=null){

					if(set.contains(head)){

						return true;
					}else{
						set.add(head);
					}

					head = head.next;
			}
			return false;
	}
}
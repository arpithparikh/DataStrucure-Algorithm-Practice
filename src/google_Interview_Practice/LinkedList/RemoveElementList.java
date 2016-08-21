//Remove the LinkedList Element from the List
Class DeleteNode{
	public void DeleteNode(ListNode head, int val){
		ListNode dummy = new ListNode(0);
		dummy.next= head;
		head = dummy;
		while(head.next!=null){
			if(head.next.val == val){
				head.next = head.next.next;
			}else{
				head = head.next;
			}
		}
		return dummy.next;
	}
}
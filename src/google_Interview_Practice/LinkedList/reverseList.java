//Reverse LinkedList
//Defination of ListNode
public class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
		this.next = null;
	}
}
//Iterative Solution
public class Solution{
	//Iterative approach 
	
	public ListNode reverseList(ListNode head){
	if(head==null || head.next == null){
		return head;
	}
	ListNode p1 = head;
	ListNode p2 = p1.next;
	head.next = null;
	while(p1!=null && p2!=null){
		ListNode t = p2.next;
		p2.next = p1;
		p1 = p2;
		p2 = t;		
	}
	}

	//Recursive approach
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode second = head.next;
		head.next = null;
		ListNode rest = reverseList(second);
		second.next = head;
		return rest;
	}
	
}

//Recursive Solution
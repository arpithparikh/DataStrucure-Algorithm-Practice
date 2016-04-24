package DataStructure.LinkedLists;
class ListNode {

	int val;
	ListNode next;
	ListNode(int x){
			val = x;
			next = null;
	}
}
public class ReverseLinkedList {
	public ListNode reverseBetween(ListNode head, int m , int n) {
		//m >= n and head == null 
		if(m >= n || head==null){
			return head;
		}
		//Creating the Dummy Node
		ListNode fake =new ListNode(0);
		fake.next = head;
		head = fake;
		for(int i = 1; i < m; i++){
			if(head == null){
				return null;
			}
			head = head.next;
		}
		ListNode premNode = head;
		ListNode mNode = head.next;
		ListNode nNode = mNode, postnNode = mNode.next;
		for(int i = m; i < n;i++){
			if(postnNode==null){
				return null;
			}
			ListNode temp = postnNode.next;
			postnNode.next = nNode;
			nNode = postnNode;
			postnNode = temp;
		}
		mNode.next = postnNode;
		premNode.next = nNode;
		return fake.next;	
	}
}
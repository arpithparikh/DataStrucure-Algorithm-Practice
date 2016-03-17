package Algorithms;

//@author :arpit
//to define the ListNode which is representative of the Linked-list
class ListNode
{
	//Value Initialization 
	int val;
	
	//
	ListNode next;
	
	//Constructor of the ListNode which hold the value
	ListNode(int x)
	{
	val=x;
	}

}

//Singly LinkedList
public class DeleteNodeInLinkedList {

	//Deleting the Node from the LinkedList
	public void deleteNode(ListNode node)
	{
		//to check the node is null and node.next is null.
		if(node==null || node.next==null)
		{
			return ;
		}
		
		//ListNode next should contain the node.next. 
		ListNode next=node.next;
		
		//Setting the next node Value.
		node.val=next.val;
		
		//link of the Node is also attached to the next node by deleting the particular node.
		node.next=next.next;
		
	}
	
	
	
	
	
}

package Cracking_Code_Book.ch2;

public class DeletetheMiddleNode {
	
	//Deleting the node
	boolean deleteNode(Node node)
	{
		//Node is null and node.next==null
		if(node==null||node.next==null)
		{
			return false;
		}
		
		//
		Node next=node.next;
		
		node.data=node.data;
		
		node.next=next.next;
		return true;
	}

}

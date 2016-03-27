package Cracking_Code_Book.ch2;

public class DeletetheMiddleNode {
	
	//1) Take a temp node and point it to the next to the accessible node. (i.e in our case temp node pointing to node D)

	//2) Copy data of temp node to accessible node. (i.e copy data of node D to node C)

	//3) Now linked accessible node to next node of temp. (i.e link node C to node E).
	
	
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

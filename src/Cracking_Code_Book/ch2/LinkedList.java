//A linked list is a data structure that represents a sequence of nodes.
//

package Cracking_Code_Book.ch2;

class Node
{
	//
	Node next=null;
	int data;
	
	public Node(int d)
	{
		data=d;
	}
	
	
	void appendToTail(int d)
	{
		Node end=new Node(d);
		Node n=this;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=end;
	}

	Node DeleteNode(Node node,int d)
	{
		
		Node n=next;//head start
		
		if(n.data==d)
		{
			return next.next; /*moved head*/
		}
		
		while(n.next!=null)
		{
			if(n.next.data==d)
			{
				n.next=n.next.next;
				return next;
			}
			n=n.next;
		}
		
		return next;
		
	}
	
}


public class LinkedList {
	
	
	

}	
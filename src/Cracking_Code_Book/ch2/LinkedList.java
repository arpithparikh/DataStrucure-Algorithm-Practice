//A linked list is a data structure that represents a sequence of nodes.
//

package Cracking_Code_Book.ch2;

class LinkedNode
{
	//
	LinkedNode next=null;
	int data;
	
	public LinkedNode(int d)
	{
		data=d;
	}
	
	
	void appendToTail(int d)
	{
		LinkedNode end=new LinkedNode(d);
		LinkedNode n=this;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=end;
	}

	LinkedNode DeleteNode(LinkedNode node,int d)
	{
		
		LinkedNode n=next;//head start
		
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
//Implement an algorithm to find the Kth to last element of a singly LinkedList.


//if the LinkedList Size is known then ,length-k

//Recursive ->Implementing this is short and sweet
//Don't return the Element 
//
package Cracking_Code_Book.ch2;

public class KthfromLast {

	private Node head;


	int printKthToLast(Node head,int k)
	{
		//check if the head is null , the precondition of any simple problem
		
		if(head!=null)
		{
			return 0;
		}
		
		//Finding the kth last index
		int index=printKthToLast(head.next, k)+1;
		
		//if the both index and k are similar
		if(index==k)
		{
			System.out.println(k+"th to last node is"+head.data);
		}
		
	return index;
		
	}
	
	
	//Iterative Approach
	
	//1.Two pointer N1,N2
	//2.point the N2 at Beginning 
	//3.Moving N1 k nodes into the list
	//4.N2 will be Length-k Nodes into the list
	Node kthLast(Node node,int k)
	{
		//Two Nodes
		//Node 1
		Node node1=head;
		//Node 2
		Node node2=head;
		
		for(int i=0;i<k;i++)
		{
			if(node1==null)
				return null;
			
			node1=node1.next;
		}
		
		while(node1!=null)
		{
			node1=node1.next;
			node2=node2.next;
		}
		return node2;
	}
	
}

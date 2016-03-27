//Implement an algorithm to find the Kth to last element of a singly LinkedList.


//if the LinkedList Size is known then ,length-k

//Recursive ->Implementing this is short and sweet
//Don't return the Element 
//
package Cracking_Code_Book.ch2;

public class KthfromLast {

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
	
}

//Remove the Duplicates from the Unsorted Linked list.

//1.Iterate over the LinkedList
//2.Adding each element to a hash table.
//3.Discover the Duplicates.
//4.We remove the element and continue iterating 
//5.Time complexity O(N) and space Complexity O(1)

package Cracking_Code_Book.ch2;

import java.util.HashSet;

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
	
}
public class RemoveDup {
	
	//Taking the LinkedList Node
	void deleteDups(Node n)
	{
		
		//Start with defining the HashTable
	
		HashSet<Integer> hashSet=new HashSet<Integer>();
	//Set the Previous node as null
		Node previous=null;
		
		//iterate till the node doesn't contain the null
		while(n!=null)
		{
			//if the it contain the same value
			if(hashSet.contains(n.data))
			{
				//delete through previous.next =n.next
				previous.next=n.next;
				
			}
			else
			{
				//else the add the data 
				hashSet.add(n.data);
				//set the previous equals the new node.
				previous=n;
			}
			
		}
		
	}
	
	

}


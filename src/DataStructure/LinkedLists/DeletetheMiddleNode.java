package DataStructure.LinkedLists;

class Node
{
	int data;
	Node Next;
	Node(int x)
	{
		data=x;
		Next=null;
	}
}


public class DeletetheMiddleNode {
	
	public  void deleteNode(Node Node_ptr)
    {
		//Temp Node
       Node temp = Node_ptr.Next;
       
       //keep the Temp data
       Node_ptr.data = temp.data;
       
       //keep the link
       Node_ptr.Next = temp.Next;
       
       //Temp =null
       temp=null;
       
    }

	

}

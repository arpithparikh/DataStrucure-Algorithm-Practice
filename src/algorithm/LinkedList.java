//The problem with this code is that the Node class is a node and a linked list at the same time, which is confusing. Other than that it should 
//be pretty straightforward.

class Node{
	
Node next = null;
int data;

public Node(int d){
	
	data = d ;
}

public void appendToTail(int d){
	
	Node end = new Node(d);

	Node n = this;

	while(n.next != null){

		n = n.next;
	}

	n.next = end;

}
}


Node deleteNode(Node head ,int d){
	

	Node n = head;

	if(n.data == d){

		return head.next;
	}

	while(n.next!=null){

		if(n.next.data == d){

			n.next = n.next.next;
			return head;
		}
		 n =n.next;

	}



}
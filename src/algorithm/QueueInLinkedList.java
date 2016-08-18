//Implement Queue By LinkedList

class Node{
	
	public int val;

	public Node next;

	Node(int val,Node next){

	this.val = val;

	this.next = next;
	}


}

public class Queue{
	
	public Node first, last;

	public Queue(){

		first = last = null;
	}

	public void enqueue(int item){

	if(first == null){

		last = new Node(item);
		fist = last;
	}else
	{

		last.next = new Node(item);
		last = last.next;
	}




	}

	public int dequeue(){

		if(first!= null){

			int item = first.val;

			first = first.next;
			return item;
		}
		return -1;
	}
}
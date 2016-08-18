//Singly LinkedList Implementation
//Operations

//1. Add the value at Start
//2. Add the value at end
//3. Delete at the start
//4. Delete at the end
//5. Get Size
//6. Get Element at Index
//7. Add Element at Specific Index
//8. Display the whole LinkedList 
class Node{
	public int data;
	public Node next;
	public Node(int data, Node next){
		this.data =  data;
		this.next =  next;
	}
}
class LinkedListT{
	public Node head;
	public int size;
	public LinkedListT(){
		   head = null;
	}	
	public void addAtBegin(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	public int deleteAtBegin(){
		int temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	public void deleteAtEnd(){
		Node currNode = head;
		if(head.next == null){

			head = null;
		}else{

			while(currNode.next.next!=null){
					currNode = currNode.next;

			}

			int temp = currNode.next.data;
			currNode.next = null;
			size--;
			}
		}
	
	}
	public void addAtEnd(int data){

		if(head == null){

			addBegin(data);
		}else{

			Node n = new Node(data);
			Node currNode = head;

			while(currNode.next! = null){

				currNode = currNode.next;

			}
			currNode.next = n;
			size++;
		}

	}

	
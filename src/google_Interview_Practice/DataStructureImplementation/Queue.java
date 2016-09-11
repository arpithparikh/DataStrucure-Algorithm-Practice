//Queue
public class Queue{
	private int elements[]; //elements in the queue
	private int tail; //tail in the Queue
	private int head; //head in the Queue
	private int size; //Size of the Queue
	public Queue(int s){
		size = s; //size
		tail =  head = 0; //tail and head
		element = new int[size]; //elements
	}
	//enqueue 
	public void enqueue(int i){ //enqueue
		element[tail] = i; // adding the element 
		tail ++;
	}
	//Dequque
	public int dequeue(){
		int value =  element[head]; //value
		head++; //increment the head
		return value; // returning the value

	}



}
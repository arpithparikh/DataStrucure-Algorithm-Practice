//Implement Stack by two Queues!

import java.util.* ;

class Stack{
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	public void move(){			//Move
		while(q1.size()!=1){
			q2.offer(q1.poll());
		}
	}
	public void swap(){ //Swap
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp; 
	}
	public void push (int x){ //Push
		q1.offer(x);

	}
	public void pop(){ 
		move();
		q1.poll();
		swap();
	}
	public int top(){
		move();
		int result = q1.poll();
		swap();
		q1.offer(result);
	}
	public boolean isEmpty(){
		return q1.size() == 0;
	}

}
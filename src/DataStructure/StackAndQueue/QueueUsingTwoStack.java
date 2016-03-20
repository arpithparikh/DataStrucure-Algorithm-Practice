//Queue: Push the new element onto In-box.
//Dequeue: If out-box is empty then refill it by each element from in-box and pushing in onto out-box.
//Pop and return the top element from out-box.

package DataStructure.StackAndQueue;

import java.util.Stack;

public class QueueUsingTwoStack<E> {
	
	Stack<E> inbox,outbox;
	
	public void queue(E item)
	{
		//Push , its enqueue operations 
		inbox.push(item);
	}
	
	public E deQueue()
	{
		//Check the precondition,for the out-box is empty or not! 
		if(outbox.isEmpty())
		{
			//check the condition, the in-box is empty or not!
			while(!inbox.isEmpty())
			{
				//push the popped value from in-box stack.
				outbox.push(inbox.pop());
			}
		}
		//remove the elements from the out-box stack!
		return outbox.pop();
	}

}

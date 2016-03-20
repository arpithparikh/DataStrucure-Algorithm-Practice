//Write a program to sort a stack in ascending order(biggest on the top).
//You may use at most one additional stack to hold time.
//but may not copy to other data structure.
//Stack supports push(),pop(),isEmpty(),peek()

//source: https://github.com/JamesJi9277/Interview.
package DataStructure.StackAndQueue;

import java.util.Stack;

public class SortStack {

	public static Stack<Integer> Sort(Stack<Integer> stack)
	{
		//Stack initialization 
		Stack<Integer> res=new Stack<Integer>();
		
		//check is it empty or not!
		while(!stack.isEmpty())
		{
			//start with temp variable which contains the pop value.
			int tmp=stack.pop();
			
			//check the stack is empty or not and check the first element of the stack greater than temp variable.
			//example [1,4,5,3]=> 4>1 after first iteration.
			while(!res.isEmpty()&&res.peek()>tmp)
			{	
				stack.push(res.pop());	
			}
			//when no element in the res stack.
			res.push(tmp);
		}
		return res;
	}
}
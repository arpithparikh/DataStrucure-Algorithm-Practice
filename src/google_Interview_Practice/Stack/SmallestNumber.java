//Give the smallest Number in the Stack
public class MinStack{
//Stack and Min stack
Stack<Integer> stack = new Stack<Integer>();
Stack<Integer> min   = new Stack<Integer>();

public void push(int x){
	
	stack.push(x);

	if(min.isEmpty()){
		min.push(x);
	}else{

		min.push(Math.min(x,min.poll()));
	}

}

public void pop(){
	
	stack.pop();
	min.pop();
}

public int top(){
	
	return stack.peek();
	
}

public int min(){
	
	min.peek();
}

	

}
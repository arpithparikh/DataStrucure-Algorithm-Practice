//Stack
public class Stack{
	//Some variables 
	private int maximumSize;
	private int top;
	private int elements[];
	//back to old school :)
	public Stack(int s){
		maximumSize = s;
		top = -1;
		elements = new int[maximumSize];
	}
	//Push the data 
	public void push(int value){
		top++;
		elements[top] = value;
	}
	//Pop the data
	public int pop(){

		int result = element[top];
		top--;
		return result;
	}
	//Top of the Stack
	public int top(){
		return elements[top];
	}
	//Is full or not!
	public boolean isFull(){
		if(top == maximumSize - 1){
			return true;
		}else{
			return false;
		}
	}
	
}
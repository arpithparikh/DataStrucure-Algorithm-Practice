//Flatten Nested List Interator

public class NestedIterator implements Iterator<Integer>{
	Stack<NestedIterator> stack = new Stack<NestedIterator>();
	public NestedIterator(List<NestedInteger> nestedList){
			for(int i = nestedList.size() - 1; i >= 0 ; i--){
				stack.push(nestedList.get(i));
			}	
	}
	public Integer next(){
		NestedInteger t = stack.pop();
		return t.getInteger();
	}
	public boolean hasNext(){

		while(!stack.isEmpty()){

			NestedInterger t = stack.peek();
			if(t.isInteger() == true){
				return true;
			}else{
				t= stack.pop();
				List<NestedInteger> list = t.getList();
				for(int i = list.size() - 1; i > = 0; i--){
					
				}
			}
		}


	}
}
//Implement Stack
class Stack{
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public void push(int x){ //Push
 		arrayList.add(x); //add
	}
	public int pop(){  //pop
		 arrayList.remove(arrayList.size() - 1); //remove
	}
	public int top(){ //top
		return arrayList.get(arrayList.size() - 1); //add
	}
	public boolean isEmpty(){  //isEmpty() return boolean
		if(arrayList.size() == 0){
				return true;
		}else{
				return false;
		}
	}
}


class Node{
	Node left,right;
	int data;
	public Node(int data){
			this.data = data;
	}
	public void insert(int value){
			if(value <= data){
				if(left == null){
					left = new Node(value);}else{
					left.insert(value);
					}
			}else{
					if(right == null){
					right =  new Node(value);
					}else{
					right.insert(value);
					}
			}
		}
	}

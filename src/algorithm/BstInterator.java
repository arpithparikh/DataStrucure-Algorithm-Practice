//BST Iterator 
public class BstIterator{
	
//Stack of the TreeNode
Stack<TreeNode> stack = new Stack<TreeNode>();

//TreeNode with reference
TreeNode crt;

//Constructor of BST Iterator
public BSTIterator(TreeNode root){
	crt = root;
}

//Has Next function
public boolean hasNext(){	
	return (!stack.isEmpty() || crt!= null);
}

//Next method 
public TreeNode next(){

		//check the crt is null or not!
	while(crt ! = null){

		//pushing the crt Node
		stack.push(crt); 

		//crt -> crt.left
		crt = crt.left;
	}
  
    // TreeNode 
	crt = stack.pop();

	//TreeNode -> crt
	TreeNode node = crt;

	//crt -> crt.right
	crt = crt.right;

	return node;
}


}
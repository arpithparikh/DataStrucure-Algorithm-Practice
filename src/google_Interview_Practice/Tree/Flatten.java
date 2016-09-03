//Flatten Binary Tree to LinkedList
public class Solution{
	public void flatten(TreeNode root){ //Flatten the Binary Tree
		//Stack 
		Stack<TreeNode> stack = new Stack<TreeNode>(); //Define the Stack
		//TreeNode
		TreeNode p = root; // TreeNode
		//loop through
		while(p!=null || !stack.empty()){ // check whether stack and treeNode is empty or not!
			if(p.right!=null){ // p.right!=null 
				stack.push(p.right);	// add the right node 
			}
			if(p.left!=null){  //p.left!=null
				p.right = p.left; // [
				p.left = null;
			}else if(!stack.empty()){
				TreeNode temp = stack.pop();
				p.right = temp;
			}
			p = p.right;
		}
	}

}
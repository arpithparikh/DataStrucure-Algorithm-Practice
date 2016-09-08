//Preorder Traversal
public class SolutionPreOrder{
	//preOrderTraversal which contains TreeNode 
	public ArrayList<Integer> preorderTraversal(TreeNode root){
		//ArrayList
		ArrayList<Integer> returnList = new ArrayList<Integer>(); //ArrayList
		if(root == null){
			return returnList; //returnList 
		}
		//stack 
		Stack<TreeNode> stack = new Stack<TreeNode>(); //Stack push 
		stack.push(root); //pushing the root 
		while(!stack.empty()){ //check if the stack is empty or not!
			TreeNode n = stack.pop(); // poping the nodes 
			returnList.add(n.val); //adding the value of the Node
		}
		//right
		if(n.right!=null){
			stack.push(n.right); //pushing the right element of the Node
		}
		//left
		if(n.left!=null){
			stack.push(n.left); //Pushing the left element of the Node
		}

	}
	//returnList
	return returnList;
}
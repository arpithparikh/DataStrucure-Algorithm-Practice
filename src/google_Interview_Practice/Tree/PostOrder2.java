//PostOrder Traversal of the TreeNode
public class SolutionPostOrder{
	public ArrayList<TreeNode> postOrderTraversal(TreeNode root){
		ArrayList<TreeNode> list = new ArrayList<TreeNode>(); //arrayList
		if(root == null){
			return list; 
		}
		Stack<TreeNode> stack = new Stack<TreeNode>(); //Stack, treeNode
		stack.push(root); //push the root node in the stack
		TreeNode prev = null; // prev node, if its null
		while(!stack.empty()){  // check the stack is empty or not! 
		TreeNode curr = stack.peek(); // current treeNode, stack.peek(); -> find the first element of the stack
			//go down to the tree.
			//check if the current node is leaf, if so, process it and pop stack.
			//otherwise, keep going down.
				if(prev == null || prev.left == curr || prev.right == curr){ //prev.left and prev.right  == curr
					if(curr.left!=null){  => check the if the curr.left !=null
						stack.push(curr.left); //curr.left , pushing the current element
					}else if(curr.right!=null){
						stack.push(curr.right); //curr.right, pushing the current element 
					}else{
						stack.pop(); //poping the element from the stack.
						list.add(curr.val); //adding the current value to the list.
					}
				}
					//current.left == prev
				else if(curr.left == prev){
					//current.right != null 
					if(curr.right!=null){
						stack.push(curr.right); //pushing the right element 
					}else{
						stack.pop(); //poping the element from the stack
						list.add(curr.val); //adding the value in the list
					}
				}else if(curr.right == prev){ //curr.right == prev
					stack.pop();
					list.add(curr.val);
				}
				prev = curr;
		}
		return list;
	}
}
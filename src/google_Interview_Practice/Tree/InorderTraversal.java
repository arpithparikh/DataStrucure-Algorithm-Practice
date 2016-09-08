//Inorder left->root ->right
//use stack to track the Nodes
//When to push node into the Stack and when to pop node out of the Stack
public class InorderTreversal{ //Inorder Traversal
public ArrayList<Integer> inorderTraversal(TreeNode root){
	ArrayList<Integer> list = new ArrayList<Integer>(); //List
	if(root == null){
		return list; 
	}
	Stack<TreeNode> stack = new Stack<TreeNode>(); //Stack
	TreeNode p = root; //root node assigned 
	while(!stack.empty()||p!=null){
		if(p!=null){
		stack.push(p); //pushing to root value to stack
		p = p.left; // p.left
		}else{
			TreeNode t = stack.pop(); //poping the treeNode
			list.add(t.val); //List.add(t.val)
			p = t.right;//t.right
		}
	}
	return returnlist; //List
	}
}
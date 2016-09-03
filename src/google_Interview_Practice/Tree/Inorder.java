//Inorder Traversal 
//List
public class Inorder{
	List<Integer> result = new ArrayList<Integer>(); //ArrayList
	public List<Integer> inOrder(TreeNode root){   //Inorder Traversal
		if(root!=null){ //if the root is not null
			helper(root); 
		}
		return result;
	}
	public void helper(TreeNode p){
		if(p.left!=null){   //left
			helper(p.left);
		}
		result.add(p.val); //root
		if(p.right!=null){ //right
			helper(p.right);
		}
	}
}

//Stack implementation 

public ArrayList<Integer> inOrder(TreeNode root){
	//ArrayList
	ArrayList<Integer> list = new ArrayList<Integer>();
	if(root == null){
		return list;
	}
	Stack<Integer> stack = new Stack<Integer>();
	//Define the pointer to track the Nodes
	TreeNode p = root;
	while (!stack.empty() || p!=null) {
		if(p!=null){
				stack.push(p);
				p =p.left;
		}else{
				TreeNode t = stack.pop();
				list.add(t.val);
				p = t.right;
		}	
	}
	return list;
}
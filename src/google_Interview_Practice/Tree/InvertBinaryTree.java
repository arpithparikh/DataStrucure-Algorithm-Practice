//Invert Binary Tree
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
	this.val = val;
	}
}
//Recurison
//Invert Binary Tree
public class InvertBinaryTree{
	//InvertTree
	public TreeNode invertTree(TreeNode root){

		//check the precondition
		if(!root = null){
			helper(root);
		}
		return root;
	}
	//helper
	public void helper(TreeNode p){
		TreeNode temp = p.left;
		p.left = p.right;
		p.right = temp;

		if(p.left!=null){
		helper(p.left);
		}
		if(p.right!=null){
		helper(p.right);
		}
	}

//Iterative
public TreeNode invertTreeIterative(TreeNode root){
	//LinkedList Implementation using the Queue
	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		//If thr root is not null , than keep adding the root 
		if(root!=null){
			queue.add(root);
		}
		while(!queue.isEmpty()){
		TreeNode p = queue.poll();
		if(p.left!=null){
			queue.add(p.left);
		}
		if(p.right!=null){
			queue.add(p.right);
		}
		TreeNode temp = p.left;
		p.left = p.right;
		p.right =  temp;
		}
		return root;
	}
}
//Binary Tree Pre Order Traversal
//Post oder and In order

//Pre order 
1. root
2.left
3.right

//In order
1.left
2.root
3.right

//post order
1.left
2.right
3.root

public class TreeNdde{
	public int val;
	public TreeNode left, right;
	public TreeNode(int val){
		this.val = val;
		this.left =this.right = null;
	}
}

public class Solution{
	//Preorder in arrayList which contains node values:
	public ArrayList<Integer> preorderTraversal(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> preoder = new ArrayList<Integer>();
		if(root ==  null){
			return preorder;
		}
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			preorder.add(node.val);
			if(node.right!= null){
			stack.push(node.right);
			}
			if(node.left!=null){
				stack.push(node.left);	
			}
		}
		return preorder;
	}
}

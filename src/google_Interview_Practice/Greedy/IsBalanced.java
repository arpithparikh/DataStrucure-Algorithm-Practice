//Definition of TreeNode
public class TreeNode{
		public int val;
	public TreeNode left,right;
	public TreeNode(int val){
		this.val = val;
		this.left = this.right =  null;
	}
}

//Balanced Binary Tree
public class Solution{	
	public boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		return helper(root).isBalanced;
	}
	public ReturnType helper(TreeNode root){
		if(root == null){
			return new ReturnType(0,true);
		}
		ReturnType left = helper(root.left);
		ReturnType right = helper(root.right);
		if(!left.isBalanced){
			return new ReturnType(0,flase);
		}
		if(!right.isBalanced){
			return new ReturnType(0,false);
		}
		return (Math.abs(left.depth - right.depth) + 1,true);
	}
}
//Validate te Binary Tree
//LeetCode 
//Recursive
public class ValidateBinaryTree{
	public boolean isValidateBST(TreeNode root){
		return isValidateBST(root,Double.Negative_INFINITY,Double.POSITIVE_INFINITY){
		}
	public boolean isValidateBst(TreNode p, double min, double max){
		if(p == null){
			return true;
		}
		if(p.val < =  min || p.val >= max){
			return false;
		}
		return isValidateBST(p.left,min,p.val) && isValidateBST(p.right,p.val,max);.
		}
	}
}
//Iterative Approach 
class BNode{
	TreeNode n;
	double left;
	double right;
	public BNode(TreeNode n, double left, double right){
		this.n = n;
		this.left = left;
		this.right = right;
	}
}
public class Solution{	
	public boolean isValidate(TreeNode root){
	if(root ==  null){
		return true;
	}
	LinkedList<BNode> queue = new LinkedList<BNode>();
	 queue.add(new BNode(root,Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	 while(!queue.isEmpty()){
	 	BNode b = queue.poll();
	 	if(b.n.val <= b.left || b.n.val >= b.right){
	 		return false;
	 	}
	 	if(b.n.left!=null){
	 		queue.offer(new BNode(b.n.left,b.left,b.n.val));
	 	}
	 	if(b.n.right!=null){
	 		queue.offer(new BNode(b.n.right,b.n.val,b.right));
	 	}
	 }
	 return true;
	}
}
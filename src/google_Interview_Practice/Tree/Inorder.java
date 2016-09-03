//Inorder Traversal 
//List
public class Inorder{
	List<Integer> result = new ArrayList<Integer>(); //ArrayList
	public List<Integer> inOrder(TreeNode root){
		if(root!=null){
			helper(root);
		}
		return result;
	}
	public void helper(TreeNode p){
		if(p.left!=null){
			helper(p.left);
		}
		result.add(p.val);
		if(p.right!=null){
			helper(p.right);
		}
	}
}
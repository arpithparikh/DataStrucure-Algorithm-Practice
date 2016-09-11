//Inorder
//left->parent->right
//Use stack to track nodes
/Understand when to push node into stack and when to pop node out of the stack
--------------------------------------------------------------------------------------------------------
public class Solution{
	List<Integer> result = new ArrayList<Integer>();
	public ArrayList<Integer> inorder(TreeNode node){

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
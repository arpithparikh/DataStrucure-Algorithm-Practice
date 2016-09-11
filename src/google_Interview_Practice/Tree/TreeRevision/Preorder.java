//Tree (Data Structure)
//Preorder Traversal
public class PreOrder{
	//ArrayList preorder Traversal
	
	public ArrayList<Integer> preorder(TreeNode node){
		List<Integer> list = new ArrayList<Integer>();
		if(root == null){
			return list;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.empty()){
			TreeNode n = stack.pop();
			list.add(n.val);

			if(n.right!=null){
				stack.push(r.right);
			}
			if(n.left!=null){
				stack.push(n.left);
			}
		}
		return list;
	}
}	
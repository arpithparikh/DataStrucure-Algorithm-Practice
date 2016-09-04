//Path Sum
// root to leaf , keep adding the value till last leaf
//BFS solution level order traversal.....
public class PathSum{
	public boolean hasPathSum(TreeNode root, int sum){
		if(root == null){ //if the root is null...
			return false;
		}
		LinkedList<TreeNode> nodes = new LinkedList<TreeNode>(); //Nodes
		LinkedList<Integer> values = new LinkedList<Integer>(); //Values
		nodes.add(root);
		values.add(root.val);
		while(!nodes.isEmpty()){
			TreeNode curr = nodes.poll(); //current 
			int sumValue = values.poll(); //sumValue
			if(curr.left == null && curr.right == null && sumValue == sum){ //curr.left== null 
				return true;
			}
			if(curr.left!=null){
				nodes.add(curr.left);
				values.add(sumValue+curr.left.val);
			}

			if(curr.right!=null){
				nodes.add(curr.right);
				values.add(sumValue+curr.right.val);
			}
		}
		return false;
	}
}
public class Solution {
	public int findKth(TreeNode root, int k) {
		if(root == null) {
			return -1;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int count = 0;
		while(!stack.isEmpty() || root != null) {
			while(root != null) {
				stack.push(root);
				root = root.right;
			}
			TreeNode temp = stack.pop();
			count++;
			if(count == k) {
				return temp.val;
			}
			root = temp.left;
		}
		return -1;
	}
}
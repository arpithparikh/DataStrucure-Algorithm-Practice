public class Solution {
	public int minSum(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = minSum(root.left);
		int right = minSum(root.right).
		if(root.left == null && root.right != null) {
			return right + root.val;
		}
		if(root.left != null && root.right == null) {
			return left + root.val;
		}
		return Math.min(left, right) + root.val;
	}
}

public class Solution {
	public int minSum(TreeNode root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return root.val;
		}
		return helper(root, 0);
	}
	private int helper(TreeNode root, int sum) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		sum += root.val;
		int left = helper(root.left, sum);
		int right = helper(root.right, sum);
		return Math.min(left, right) + root.val;
	}
}
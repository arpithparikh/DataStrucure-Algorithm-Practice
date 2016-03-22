public class Solution {
	public boolean isSubtree(TreeNode t1, TreeNode t2) {
		if(t1 == null || t2 == null) {
			return (t2 == null) ? true : false;
		}
		return isSametree(t1, t2) || isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
	}
	private boolean isSametree(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null) {
			return true;
		}
		if(t1 == null || t2 == null) {
			return false;
		}
		if(t1.val != t2.val) {
			return false;
		}
		if(t1.val == t2.val && t1.left == null && t1.right == null && t2.left == null && t2.right == null) {
			return true;
		}
		return isSametree(t1.left, t2.left) && isSametree(t1.right, t2.right);
	}
}
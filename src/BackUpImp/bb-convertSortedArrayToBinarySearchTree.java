public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return null;
        }
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
    }
    private TreeNode helper(int[] nums, int start, int end) {
    	if(start > end) {
    		return null;
    	}
    	//一定要像这样取中间数
    	int rootIndex = start + (end - start) / 2;
    	TreeNode root = new TreeNode(nums[rootIndex]);
    	root.left = helper(nums, start, rootIndex - 1);
    	root.right = helper(nums, rootIndex + 1, end);
    	return root;
    }
}
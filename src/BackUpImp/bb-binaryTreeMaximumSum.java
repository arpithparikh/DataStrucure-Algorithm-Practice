public class Solution {
    public int maxPathSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return root.val;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(Integer.MIN_VALUE);
        helper(root,list);
        return list.get(0);
    }
    private int helper(TreeNode root, ArrayList<Integer> list) {
        if(root == null) {
            return 0;
        }
        int left = helper(root.left, list);
        int right = helper(root.right, list);
        int sum = root.val + Math.max(left, 0) + Math.max(right, 0);
        if(sum >= list.get(0)) {
            list.set(0, sum);
        }
        return root.val + Math.max(left, Math.max(right, 0));
    }
}
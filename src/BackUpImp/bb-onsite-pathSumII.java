public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        helper(root, res, temp, sum);
        return res;
    }
    private void helper(TreeNode root, List<List<Integer>> res, List<Integer> temp, int sum) {
        if(root == null) {
            return;
        }
        sum -= root.val;
        temp.add(root.val);
        if(sum == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<Integer>(temp));
        }
        helper(root.left, res, temp, sum);
        helper(root.right, res, temp, sum);
        temp.remove(temp.size() - 1);
        sum += root.val;
    }
}
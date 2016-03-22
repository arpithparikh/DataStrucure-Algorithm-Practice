/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int closestValue(TreeNode root, double target) {
        if(root == null) {
            return 0;
        } 
        if((root.left == null && root.right == null) || (double)root.val == target) {
            return root.val;
        }
        int res = 0;
        double minDiff = Double.POSITIVE_INFINITY;
        while(root != null) {
            if(minDiff > Math.abs(root.val - target)) {
                minDiff = Math.abs(root.val - target);
                res = root.val;
            }
            if((double)root.val == target) {
                return root.val;
            }
            else if((double)root.val > target) {
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return res;
    }
}
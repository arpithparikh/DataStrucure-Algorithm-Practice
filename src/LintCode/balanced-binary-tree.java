package LintCode;

/*SOtion of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
 class ReturnType{
     boolean isBalanced;
     int depth;
     ReturnType(boolean a, int b){
         isBalanced = a;
         depth = b;
     }
 }
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        return helper(root).isBalanced;
    }
    private ReturnType helper(TreeNode root){
        if(root == null){
            return new ReturnType(true, 0);
        }
        ReturnType left = helper(root.left);
        ReturnType right = helper(root.right);
        if(!left.isBalanced || !right.isBalanced){
            return new ReturnType(false, 0);
        }
        if(Math.abs(left.depth - right.depth) > 1){
            return new ReturnType(false,0);
        }
        //æœ€å�Žéœ€è¦�åŠ ä¸€åˆ«å¿˜äº†
        return new ReturnType(true, Math.max(left.depth, right.depth)+1);
    }
}

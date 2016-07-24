//TreeNode 


/**
 * Definition of TreeNode:
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
     int depth;
     
     boolean isBalanced;
     
     ReturnType(int a, boolean b){
         
         depth = a;
         
         isBalanced = b;
         
     }
 }
 
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if(root == null){
            return true;
        }
        return helper(root).isBalanced;
    }
    public ReturnType helper(TreeNode root){
        if(root == null){
            return new ReturnType(0, true);
        }
        ReturnType left = helper(root.left);
        ReturnType right = helper(root.right);
        if(!left.isBalanced){
            return new ReturnType(0, false);
        }
        if(!right.isBalanced){
            return new ReturnType(0, false);
        }
        if(Math.abs(left.depth - right.depth) > 1){
            return new ReturnType(0, false);
        }
        return new ReturnType(Math.max(left.depth, right.depth) + 1, true);
    }
}   
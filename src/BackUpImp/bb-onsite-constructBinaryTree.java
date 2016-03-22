public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if(preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = 0;
        for(int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == root.val) {
                rootIndex = i;
                break;
            }
        }
        int length = rootIndex - inStart;
        TreeNode left = helper(preorder, preStart + 1, preStart + length, inorder, inStart, rootIndex - 1);
        TreeNode right = helper(preorder, preStart + length + 1, preEnd, inorder, rootIndex + 1, inEnd);
        root.left = left;
        root.right = right;
        return root;
    }
}
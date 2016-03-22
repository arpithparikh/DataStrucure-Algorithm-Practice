public class Solution {
    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        //先对左右分别flatten然后再拼接上
        //BB的那道onsite是说的是每一个node有down和right指针，其实跟TreeNode的left和right指针是一样的
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;
        TreeNode temp = root;
        while(temp.right != null) {
            temp = temp.right;
        }
        temp.right = right;
    }
}
Given inorder and postorder traversal of a tree, construct the binary tree.
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0) {
        	return null;
        }
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    private TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
    	if(inStart < 0 || inStart >= inorder.length || inStart > inEnd || postStart < 0 || postEnd >= postorder.length || postStart > postEnd) {
    		return null;
    	}
    	TreeNode root = new TreeNode(postorder[postEnd]);
    	int index = 0;
    	for(index = 0; index < inorder.length; index++) {
    		if(inorder[index] == root.val) {
    			break;
    		}
    	}
    	int length = index - inStart;
    	//在这里的需要把length带入计算，不然容易算错，最好举个例子
    	root.left = helper(inorder, inStart, index - 1, postorder, postStart, postStart + length - 1);
    	root.right = helper(inorder, index + 1, inEnd, postorder, postStart + length,postEnd - 1);
    	return root;
    }
}


Given preorder and inorder traversal of a tree, construct the binary tree.
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
        	return null;
        }
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    	if(preStart < 0 || preStart >= preorder.length || inStart < 0 || inEnd >= inorder.length || preStart > preEnd || inStart > inEnd) {
    		return null;
    	}
    	TreeNode root = new TreeNode(preorder[preStart]);
    	int index = 0;
    	for(index = 0; index < inorder.length; index++) {
    		if(inorder[index] == root.val) {
    			break;
    		}
    	}
    	int length = index - inStart;
    	root.left = helper(preorder, preStart + 1, preStart + length, inorder, inStart, index - 1);
    	root.right = helper(preorder, preStart + length + 1, preEnd, inorder, index + 1, inEnd);
    	return root;
    }
}
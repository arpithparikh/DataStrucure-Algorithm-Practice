//Construct the Binary Tree From Inorder and PostOrder Traversal
// 4 2 5 1 6 7 3 8 ->  In  -order
// 4 5 2 6 7 8 3 (1) ->Post-order
//Post Order Array, last element is the root
public class BuildTree{
	public TreeNode buildTree(int[] inorder,int[] postorder){
		int inStart = 0;
		int inEnd = inorder.length - 1;
		int postStart = 0;
		int postEnd = postorder.length - 1;
		return buildTree(inorder,inStart,inEnd,postorder,postStart,postEnd);
	}
	public TreeNode buildTree(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd){

		if(inStart > inEnd || postStart> postEnd){
				return null;
		}
		int rootValue = postorder[postEnd];//getting the root node
		TreeNode root= new TreeNode(rootValue);
		int k = 0;
		for(int i = 0; i < inorder.length ; i++){
			if(inorder[i] == rootValue){ //find the two part of the tree
				k = i;
				break;
			}
		}
		root.left = buildTree(inorder,inStart,k - 1,postorder,postStart,postStart + k - (inStart+1));
		root.right =  buildTree(inorder,k+1,inEnd,postorder,postStart+k - inStart,postEnd - 1);
		return root;
	}
}
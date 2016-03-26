package DataStructure.TreeGraph;

//Tree
class Tree{
	
	public Node root;
}

public class TreeTraversal {
	
	
	//Traverse Left Subtree by recursively calling the in-oder function
	//Display the current node or root node.
	//Traverse the right sub tree
	//Basically left->root->right meaning the in order traverse.
	void inOrderTraversal(TreeNode node)
	{
		if(node!=null)
		{
			
			inOrderTraversal(node.left);
			visit(node);//root
			inOrderTraversal(node.right);
			
			
		}
	}

	private void visit(TreeNode node) {
		// TODO Auto-generated method stub
		
	}
	
	//Traverse Left
	//Than right
	//Root
	void postOrderTraversal(TreeNode node)
	{
		if(node!=null)
		{
			
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
			visit(node);//root
			
		}
	
	}
	
	//root
	//left
	//right
	void preOrderTraversal(TreeNode node)
	{
		if(node!=null)
		{
			visit(node);//root
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
			
			
		}
	
	}

}

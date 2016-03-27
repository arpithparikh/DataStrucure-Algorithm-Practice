//check if a binary Tree is balanced .
//find the height of tree from recursive function , but for each node , time complexity would be O(nlogn).

package DataStructure.TreeGraph;

//TreeNode Class
class TreeNode{
	
	//consist value
	int val;
	
	//Left Child
	TreeNode left;
	
	//Right Child
	TreeNode right;
	
	//Constructor
	TreeNode(int x){
		val=x;
	}
	
}

//Binary Tree Imple to check wheather the tree is balanced or not!
public class BinaryTree {

	public static boolean isBalanced(TreeNode root)
	{
		if(root==null)
		return false;
		
		int hightDiff=Math.abs(getHeight(root.left)-getHeight(root.right));
		
		if(hightDiff>1)
			return false;
		else
			return isBalanced(root.left)&&isBalanced(root.right);
	}

	private static int getHeight(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		return Math.max(getHeight(root.left),getHeight(root.right))+1;
	}
	
	
	public static TreeNode testTree()
	{
		//root node
		TreeNode node1=new TreeNode(7);
		TreeNode node2=new TreeNode(4);
		TreeNode node3=new TreeNode(9);
		
		node1.left=node2;
		node1.right=node3;
		
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		
		node2.left = node4;
		node2.right = node5;
		
		TreeNode node6 = new TreeNode(8);
		TreeNode node7 = new TreeNode(10);
		
		node3.left = node6; 
		node3.right = node7;
		
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(10);
		
		node4.left = node8; 
		node4.right = node9;
		
		TreeNode node10 = new TreeNode(10);
		
		node5.right = node10;
		
		TreeNode node11 = new TreeNode(11);
		
		node7.right = node11;
		
		TreeNode node12 = new TreeNode(0);
		
		node8.left = node12;
		
		return node1;
	}
	
	public static void main(String args[])
	{
		TreeNode root1=testTree();
		System.out.println(isBalanced(root1));
		
		
		//Not balanced =>False
	}

	
	
}

//It should be complete tree
//Every Node's value should be greater than the child nodes.


package DataStructure.Heap;

import DataStructure.TreeGraph.BinaryTree;

//Defining the Tree with data and left and right children
 class Node
{
	int data;
	Node left,right;
	
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}





public class ChecktheBinarytree {
	
	static Node root;
	
	//this method is going to count the numbers of nodes in the tree.
	int countNodes(Node node)
	{
		if(node==null)
		{
			return (0);
		}
		
		
		return (1+countNodes(node.left)+countNodes(node.right));
		
	}
	
	boolean isComplete(Node node,int index,int number_nodes)
	{
		//if there is no nodes then empty tree is complete
		if(node==null)
		{
			return true;
		}
		
		//if index assigned to current node is more than number of nodes in tree then tree is not complete
		if(index>=number_nodes)
		{
			return false;
		}
		
		
		
		return (isComplete(node.left,2*index+1, number_nodes)&&isComplete(node.right, 2*index+2, number_nodes));
	}
	
	public static void main(String args[])
	{
		ChecktheBinarytree tree = new ChecktheBinarytree();
       // Node NewRoot = null;
        ChecktheBinarytree.root = new Node(1);
        ChecktheBinarytree.root.left = new Node(2);
        ChecktheBinarytree.root.right = new Node(3);
        ChecktheBinarytree.root.left.right = new Node(5);
        ChecktheBinarytree.root.left.left = new Node(4);
        ChecktheBinarytree.root.right.right = new Node(6);
        ChecktheBinarytree.root.right.left = new Node(6);
         
        //Output the binary Tree is Complete.
        
        //count the number of nodes
        int node_count = tree.countNodes(root);
        int index = 0;
         
        if (tree.isComplete(root, index, node_count))
            System.out.print("The binary tree is complete");
        else
            System.out.print("The binary tree is not complete"); 
		
	}
	

}

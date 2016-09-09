//ISBST or not!
public class BinaryTree{
	//Root of the Binary Tree
	Node root;
	//search shitty tree
	boolean IsBST(){
		return helper(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	boolean helper(Node node, int min, int max){
		if(node == null){ //if the node == null
			return true; 
		}
		if(node.data < min || node.data > max){ //check whether data greater or less than value
			return false;
		}
		return (helper(node.left, min,node.data -1) && helper(node.right,node.data+1,max)); //
	}
} 
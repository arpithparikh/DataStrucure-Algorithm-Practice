//Largest BST Subtree 
//Wrapper which is having the size, lower and upper , check the Wrapper class is BST or not!
class Wrapper{
	int size; //size
	int lower,upper; //lower and upper
	boolean isBST; //isBST 
	public Wrapper(){ 
		lower = Integer.MAX_VALUE; //Max value
		upper = Integer.MIN_VALUE; //Min value
		isBST = false; //
		size = 0; //size of the BST
	}
}
//Solution of the largestBSTsubstree
public class Solution{
	//Largest BST Subtree
	public int largestBSTSubstree(TreeNode root){
			return helper(root).size;
	}
	//Wrapper helper (TreeNode node)
	public Wrapper helper(TreeNode node){
		Wrapper curr = new Wrapper(); //Wrapper class
		if(node == null){ //if the node is null
			curr.isBST = true; // 
			return curr;
		}
		Wrapper l = helper(node.left); //wrapper 1 //node.left
		Wrapper 2 = helper(node.right);//wrapper 2 //node.right
		//current subtree's bounderies 
		curr.lower = Math.min(node.MIN_VALUE,l.lower); //Math.min(node.MIN_VALUE, l.lower)
		curr.upper = Math.min(node.val,r.upper);

		//check left and right subtree are BST or not
		//check left's upper again current's value and right's lower against current's value
		if(l.isBST && r.isBST && l.upper <= node.val && r.lower >= node.val){
				curr.size =  l.size + r.size + 1; // Current . size  = left.size +  right.size + 1
				curr.isBST = true; //
		}else{
				curr.size = Math.max(l.size ,r.size);
				curr.isBST= false;
		}
		return curr;

	}
}
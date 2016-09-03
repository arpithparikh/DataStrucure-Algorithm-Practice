package google_Interview_Practice.Tree;
import java.util.ArrayList;
import java.util.Stack;
class TreeNode{ //TreeNode
	int val; //value
	TreeNode left; //left
	TreeNode right; //right
	TreeNode(int x){val = x ;};
}
//Pre-order traversal  
//store the left and right children
//push right child first so that it is processed after the left child
public class PreeOrder {
	public ArrayList<Integer> preorderTraversal(TreeNode root){
		//ArrayList 
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if(root == null){
			return returnList;
		}
		//Stack for the TreeNode
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node = stack.pop(); //Popping the stack node
			returnList.add(node.val); 
			if(node.right!=null){
				stack.push(node.right);
			}
			if(node.left!=null){
				stack.push(node.left);
			}
		}
		return returnList;	
	}
}

package google_Interview_Practice.Tree;
import java.util.ArrayList;
import java.util.Stack;
/*class TreeNode{ //TreeNode
int val; //value 
TreeNode left; //left
TreeNode right; //right
TreeNode (int val){ 
	this.val = val; //value
}
}*/
public class PostOrder {
	public ArrayList<Integer> postorderTraversal(TreeNode root){
		//ArrayList 
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root == null){
			return list;
		}
		//Stack
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);//pushing the root first
		//check the current node is the leaf, otherwise keep going down end of the leaf node.
		TreeNode prev = null;
		while(!stack.isEmpty()){
			TreeNode curr = stack.peek();
			if(prev ==  null || prev.left == curr || prev.right == curr ){
				if(curr.left!=null){
					stack.push(curr.left);
				}else if(curr.left!=null){
					stack.push(curr.right);
				}else{
					stack.pop();
					list.add(curr.val);
				}
			}else if(curr.left == prev){ //check the curr.left == prev
				if(curr.right!=null){
					stack.push(curr.right);
				}else{
					stack.pop();
					list.add(curr.val);
				}
			}else if(curr.right ==  prev){
				stack.pop();
				list.add(curr.val);
			}
			prev = curr;
		}
		return list;	
	}
}
import java.util.Stack;

//Adding All Nodes in the BST
//Simple in order traversal
class TreeNode{
	
	int val;
	TreeNode left,right;
	TreeNode(int val){
		this.val = val;
	}
}
public class NodeSum {
		public static int sumNode(TreeNode node){
			//if the node is empty
			if(node ==  null){
				return 0;
			}
			int sum  = 0;
			//Stack of the TreeNode
			Stack<TreeNode> stack = new Stack<TreeNode>();
			stack.push(node);
			
			while(!stack.empty()){
				
				TreeNode treeNode = stack.pop();
				 sum =  sum + treeNode.val;
				 
				 if(treeNode.right!=null){
					 
					 stack.push(treeNode.right);
				 }
				 
				 if(treeNode.left!=null){
					 stack.push(treeNode.left);
				 }
			}
			return sum;
			
		}
		
		
		public static void main(String[] args){
			
			TreeNode node = new  TreeNode(1);
			node.left =  new TreeNode(2);
			node.right = new TreeNode(3);
			
			System.out.print(NodeSum.sumNode(node));
			
		}

	}

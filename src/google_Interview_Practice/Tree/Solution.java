package google_Interview_Practice.Tree;
//LevelOrderTraversal
//[[3],[9,20],[15,7]]===>whole list inside the list
public class Solution{ //this is just Solution
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){ //level-order traversal
	//ArrayList LevelOrder Traversal
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(); //AL
	ArrayList<Integer> nodeValues = new ArrayList<Integer>(); //for the node_values
		if(root ==  null){ // check if the root is null or not!
			return al; //arrayList
		}
	//Current and Next
	LinkedList<TreeNode> current = new LinkedList<TreeNode>();  //current q1
	LinkedList<TreeNode> next    = new LinkedList<TreeNode>(); // current q2
	current.add(root); //current
	while(!current.isEmpty()){ //check whether the current is empty or not!
		TreeNode node = current.remove(); // first need to remove the current node
		if(node.left!=null){ // check the node.left! = null
			next.add(node.left); // add the left leaf
		}
		if(node.right!=null){ // check the node.right! = null
			next.add(node.right); // add the right leaf
		}
		nodeValues.add(node.val); // add the node value
		if(current.isEmpty()){ // check the current is empty or not
			current = next; // current =  next
			next = new LinkedList<TreeNode>)();
			al.add(nodeValues);
			nodeValues = new ArrayList();
		}
	}
	return al;
	}
}
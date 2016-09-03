//Kth element in the BST(Binary Search Tree)
//Take a variable counter, which keep track of number of smallest element 
//Do inoder traversal , and keep track of kth minimum element 
public class BSTKthElement{
	public int FindkthSmallestElement(TreeNode root,int k){
	//List
	List<Integer> list = new ArrayList<Integer>(); // for printing , but we're doing comparing instead of Printing
	//Stack
	Stack<Integer> stack = new Stack<Integer>();
	//Min 
	int result = 0;
	TreeNode p = root;
		while(!stack.empty() || p != null){

			if(p!= null){

				stack.push(p);
				p  = p.left;

			}else{

				TreeNode t = stack.pop(); // root node
				k--;  // decresing k
				if(k == 0)
				result = t.val; //answer
				p = t.right; 
			}

		}
		return result;
	}
}
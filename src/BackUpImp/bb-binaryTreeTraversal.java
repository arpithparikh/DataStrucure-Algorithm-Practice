preorder recursive
public class Solution {
	public ArrayList<Integer> traversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		helper(root, res);
		return res;
	}
	private void helper(TreeNode root, ArrayList<Integer> res) {
		if(root == null) {
			return;
		}
		res.add(root.val);
		helper(root.left, res);
		helper(root.right, res);
	}
}

preorder iterative
public class Solution {
	public ArrayList<Integer> traversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			res.add(temp.val);
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
		return res;
	}
}

inorder recursive
public class Solution {
	public ArrayList<Integer> traversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		helper(root, res);
		return res;
	}
	private void helper(TreeNode root, ArrayList<Integer> res) {
		if(root == null) {
			return ;
		}
		helper(root.left, res);
		res.add(root.val);
		helper(root.right, res);
	}
}

inorder iterative
public class Solution {
	public ArrayList<Integer> traversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(!stack.isEmpty() || root != null) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			TreeNode temp = stack.pop();
			res.add(temp.val);
			root = temp.right;
		}
		return res;
	}
}

postorder recursive
public class Solution {
	public ArrayList<Integer> traversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		helper(root, res);
		return res;
	}
	private void helper(TreeNode root, ArrayList<Integer> res) {
		if(root == null) {
			return;
		}
		helepr(root.left, res);
		helper(root.right, res);
		res.add(root.val);
	}
}

postorder iterative
public class Solution {
	public ArrayList<Integer> traversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		TreeNode prev = null;
		TreeNode cur = null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			cur = stack.peek();
			if(prev == null || prev.left == cur || prev.right == cur) {
				if(cur.left != null) {
					stack.push(cur.left);
				}
				else if(cur.right != null) {
					stack.push(cur.right);
				}
			}
			else if(cur.left == prev) {
				if(cur.right != null) {
					stack.push(cur.right);
				}
			}
			else {
				stack.pop();
				res.add(cur.val);
			}
			prev = cur;
		}
		return res;
	}
}

preorder + reverse
public class Solution {
	public ArrayList<Integer> traversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			res.add(temp.val);
			if(temp.left != null) {
				stack.push(temp.left);
			}
			if(temp.right != null) {
				stack.push(temp.right);
			}
		}
		Collections.reverse(res);
		return res;
	}
}
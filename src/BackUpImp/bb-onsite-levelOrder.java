public class Solution {
	public ArrayList<Integer> helper(TreeNode root, int target) {
		if(root == null) {
			return null;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		boolean find = false;
		while(!queue.isEmpty()) {
			int size = queue.size();
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i = 0; i < size; i++) {
				TreeNode temp = queue.poll();
				res.add(temp.val);
				if(temp.val == target) {
					find = true;
				}
				if(temp.left != null) {
					queue.offer(temp.left);
				}
				if(temp.right != null) {
					queue.offer(temp.right);
				}
			}
			if(find == true) {
				return res;
			}
		}
		return null;
	}
}
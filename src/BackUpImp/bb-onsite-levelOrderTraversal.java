recursive
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        helper(root, res, 0);
        return res;
    }
    private void helper(TreeNode root, List<List<Integer>> res, int level) {
        if(root == null) {
            return;
        }
        if(res.size() == level) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        helper(root.left, res, level + 1);
        helper(root.right, res, level + 1);
    }
}



iterative

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> each = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                each.add(temp.val);
                if(temp.left != null) {
                    queue.offer(temp.left);
                }
                if(temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            res.add(each);
        }
        return res;
    }
}
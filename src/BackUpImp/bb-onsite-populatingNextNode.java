public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) {
            return;
        }
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeLinkNode temp = queue.poll();
                if(i == size - 1) {
                    temp.next = null;
                }
                else {
                    temp.next = queue.peek();
                }
                if(temp.left != null) {
                    queue.offer(temp.left);
                }
                if(temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
    }
}
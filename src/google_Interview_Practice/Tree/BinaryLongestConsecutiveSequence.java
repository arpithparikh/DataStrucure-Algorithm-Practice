//Binary Tree Longest Consecutive Sequence //
//Longest Consecutive Path need to be from the parent to child
public int logestConsecutive(TreeNode root){
	if(root ==  null){
		return 0;
	}
	LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>(); //Node Queue
	LinkedList<Integer> sizeQueue = new LinkedList<Integer>(); //Size Queue
	nodeQueue.offer(root);
	sizeQueue.offer(1);
	int max = 1;
	while(!nodeQueue.isEmpty()){
	TreeNode head = nodeQueue.poll();
	int size = sizeQueue.poll();
	if(head.left!=null){
	int leftSize =  size;
	if(head.val  == head.left.val - 1){}
		leftsize++;
		max = Math.max(max,leftsize);
	}else{
		leftsize = 1;
	}
	nodeQueue.offer(head.left);
	sizeQueue.offer(leftsize);
	}
	if(head.right!=null){
	int rightSize = size;
	if(head.val == head.right.val - 1){
		rightsize++;
		max = Math.max(max,rightsize);
	}else{
		rightsize=1;
	}
	nodeQueue.offer(head.right);
	sizeQueue.offer(rightsize);
	}
	return max;
}

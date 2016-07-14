//Binary Tree Serialization 

class Solution{
	
	public String BinaryTreeSerialization(TreeNode node){

	//if the root is empty
	if(root == null){

		return "{}";
	}

	//if root is not Empty , we are keeping everything in the Queue
	StringBuilder sb = new StringBuiler();

	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	queue.offer(root);
	sb.append("{");

	while(!queue.isEmpty()){

		TreeNode crt = queue.poll();

		if(crt == null){

			sb.append("#");
			sb.append(",");
		}else
		{
			sb.append(crt.val);
			sb.append(',');
			sb.append(crt.left);
			sb.append(crt.right);
		}
	}

		sb.deleteCharAt(sb.lenght()-1);
		sb.append("}");
		return sb.toString();

	}
}
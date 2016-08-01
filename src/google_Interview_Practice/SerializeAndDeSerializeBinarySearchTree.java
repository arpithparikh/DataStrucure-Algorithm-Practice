//Binary Tree Serialization and DeSerialization Problem

// {1,2,#,3,4}

//TreeNode
class TreeNode{
	
	int val;
	TreeNode left,right;
	TreeNode(int val){
		this.val = val;
	}
}

public String serialize(TreeNode root){
	
		StringBuilder sb = new StringBuilder();
		helper(root,sb);
		return sb.toString();
}

public void helper(TreeNode x,StringBuffer sb){
	

	if(x == null){

		sb.append("# ");
	}else{

		sb.append(x.val + " ");
		helper(x.left,sb);
		helper(x.right,sb);
	}

}

public TreeNode deserialize(String s){
	
	if(s == null || s.length() == 0) return null;

	StringTokenizer st = new StringTokenizer(s," ");

	return deserialize(st);
}


private TreeNode deserialize(StringTokenizer st){
	
	if(!st.hasMoreTokens()){
		return null;

	}

	String val = st.nextToken();

	if(val.equals("#")){
		return null;

	}

	TreeNode root = new TreeNode(Integer.parseInt(val));
	root.left = deserialize(st);
	root.right = deserialize(st);
	return root;
}



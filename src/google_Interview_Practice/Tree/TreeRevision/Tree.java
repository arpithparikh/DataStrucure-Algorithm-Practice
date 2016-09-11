//Tree
//Find the leaves of Binary Tree
//Given a Binary Tree , collect 
//finding the index of the element in the result list, dfs problem on trees
public List<List<Integer>> findLeaves(TreeNode root){
	List<List<Integer>> result = new ArrayList<List<Integer>>(); //List
	helper(result, root); //helper
	return result; //result
}
// traverse the tree bottom-up recursively
private int helper(List<List<Integer>> list, TreeNode root){
	if(root == null){ // root == null
		return -1;
	}
	//left,right , recursive functions 
	int left  = helper(list, root.left); //left tree
 	int right = helper(list, root.right); //right tree
 	//current 
	int curr = Math.max(left, right) + 1; //curr => Math.max(left,right)+1 // current 
	
	//the first time this code is reached is when curr = 0,
	//since the tree is bottom-up processed
	if(list.size() < = curr){  //list.size() < = curr 
		list.add(new ArrayList<Integer>()); //adding the new list 
	}
	list.get(curr).add(root.val);
	return curr;
}
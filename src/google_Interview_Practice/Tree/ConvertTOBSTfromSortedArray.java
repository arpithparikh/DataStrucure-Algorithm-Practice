//Convert Sorted array to Binary Search Tree
//[1,5,8,12,15] into Binary Search Tree 
public class BinarySearchTreeConvert{
	
	public TreeNode sortedArrayToBST(int[] num){
		if(num.length == 0){
		return null;
		}

		return sortedArrayToBST(num,0,nums.length - 1);
	}

	public TreeNode sortedArrayToBST(int[] num,int start, int end){
			if(start > end){
				return null;;
			}
			int mid = (start+end) / 2; // mid
			TreeNode root = new TreeNode(nums[mid]);
			root.left = sortedArrayToBST(num,start, mid - 1);
			root.right = sortedArrayToBST(nus,mid +1 ,end);
			return root;
	}

}
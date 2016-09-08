//TreeNode
class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
}
//Binary Search Tree ->for all Nodes. left children <= current <= right children .
//Balanced vs. Unbalanced Binary Tree => depth of the left and right subtrees of every node differ by 1 or less.
//Fully Binary Tree => Every Node other than the leaves have two children .
//Perfect Binary Tree=> All leaves have same level and same depth , every parents has two children . 
//Complete Binary Tree => Every Level except possibly the last , is completely filled and all nodes are as far left as possible.

//Basic, creation, Internal 
->Find-MAX AND Find Min: Find the maximum item of a max-heap or minimum item of a min-heap
->Insert:Adding a new key to the heap(a.k.a., push)
->extract-min :Returns the node of minimum value from a min heap after removing it from the heap
->delete: Max or Delete-min: removing the root node of max or Min heap
->Replace: pop root and push a new key

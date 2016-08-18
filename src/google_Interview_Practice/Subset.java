//Subset of the given Integer , given the Integer array
public class Subsets{
public ArrayList<ArrayList<Integer>> subset(int[] nums){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		helepr(res,list,nums, 0)
		return res;
}
public void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list , int [] nums, int start){
	res.add(new ArrayList<Integer>(list));
	for(int i = 0 ; i < nums.length ; i++){
		list.add(nums[i]);
		helper(res,list,nums,i+1);
		list.remove(list.size() - 1);
	}
}
	}

}
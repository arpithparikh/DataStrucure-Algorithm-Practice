//SubSets => Return all possible subsets 



public class Subsets{
		public ArrayList<ArrayList<Integer>> subsets(int[] nums){
			//res and list 
			ArrayList<ArrayList<Interger>> res = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			Arrays.sort(nums);
			helper(res,list,nums, 0);
			return res;
		}
		public void helper(ArrayList<ArrayList<Integer> res, ArrayList<Integer> list, int[] nums, int start){
				res.add(new ArrayList<Integer>(list));
				for(int i = start ; i < nums.length ; i++){
					list.add(nums[i]);
					helepr(res,list,nums, i+1);
					list.remove(list.size() -1);
				}
		}
}
//Subset of the String 
public class Solution{
	public ArrayList<ArrayList<Integer>> subsets(int[] nums){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); //ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>(); //List 
		ArrayList.sort(nums);// Sort the number or characters
		helper(res,list,nums,0); // helper to make the subsets
		return res;
	}
	public void helper(ArrayList<ArrayList<Intger>> res,ArrayList<Intger> list, int[] nums,int start){

		res.add(new ArrayList<Intger> (list));
		for(int i =start ; i < nums.length ; i++){

			list.add(nums[i]);
			helper(res,list,nums,i+1);
			list.remove(list.size() - 1);
		}
	}
}
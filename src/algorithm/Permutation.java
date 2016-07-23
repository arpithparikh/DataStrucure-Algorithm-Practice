//Permuation of the String or number 
//String Permuation 
class Solution{
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums){
		//result
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(nums == null || nums.size() == 0){
			return res;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		int [] visited = new int[nums.size()];
		helper(res,list,nums,visited);
		return res;
	}
	public 	void helper(ArrayList<ArrayList<Intger>> res, ArrayList<Integer> list,ArrayList<Intger> nums,int[] visited){
		if(list.size() == nums.size()){
				res.add(new ArrayList<Integer>(list));
		}
		for(int i = 0; i < nums.size(); i++){
			if(visited[i] == 1){
				continue;
			}
			visited[i] = 1;
			list.add(nums.get(i));
			helper(res,list,nums,visited);
			list.remove(list.size() - 1);
			visited[i] = 0;
		}
	}
}

public class Solution {
	public int totalNum(int n) {
		int[] res = new int[n + 1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;
		res[3] = 4;
		//因为我只管之前能够由哪一个状态跳到当前状态，当i大于3时，上一个状态有三种可能，所以需要有三个当前状态共同推导出下一个状态
		for(int i = 4; i < n; i++) {
			res[i] = res[i - 1] + res[i - 2] + res[i - 3];
		}
		return res[n];
	}
}
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.

修改后的DP，时间On2，空间On
为了避免重复运算，我们采用先定i，然后从0-i的区间来找有没有数能够到达i，如果可以的话就直接break，最大程度上的避免了重复运算
public class Solution {
    public boolean canJump(int[] nums) {
        // wirte your code here
        if(nums == null || nums.length == 0) {
            return false;
        }
        int length = nums.length;
        boolean[] res = new boolean[length];
        res[0] = true;
        for(int i = 1; i < length; i++) {
            for(int j = 0; j < i; j++) {
                if(res[j] == true && j + nums[j] >= i) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res[length - 1];
    }
}

greedy
public class Solution {
	public boolean canJump(int[] nums) {
		if(nums == null || nums.length == 0) {
			return false;
		}
		int reach = 0;
		for(int i = 0; i < nums.length && i <= reach; i++) {
			reach = Math.max(reach, nums[i] + i);
		}
		return reach >= A.length - 1;
	}
}
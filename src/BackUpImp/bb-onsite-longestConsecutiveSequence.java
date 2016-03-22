public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
        int max = 1;
        int temp = 1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
        	if(nums[i] + 1 == nums[i + 1]) {
        		temp++;
        		max = Math.max(max, temp);
        	}
        	else if(nums[i] == nums[i + 1]) {
        	    continue;
        	}
        	else {
        		temp = 1;
        	}
        }
        return max;
    }
}


public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(Integer item : nums) {
            if(!set.contains(item)) {
                set.add(item);
            }
        }
        int max = 1;
        for(int i = 0; i < nums.length; i++) {
            int pivot = nums[i];
            int count = 1;
            set.remove(pivot);
            pivot++;
            while(set.contains(pivot)) {
                set.remove(pivot);
                pivot++;
                count++;
            }
            pivot = nums[i] - 1;
            while(set.contains(pivot)) {
                set.remove(pivot);
                pivot--;
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
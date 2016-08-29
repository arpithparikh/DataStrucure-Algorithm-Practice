package google_Interview_Practice.Array;
import java.util.Arrays;
public class ThreeSum {
	public int threeSumClosest(int[] nums,int target){
		//MIN
		int min = Integer.MAX_VALUE;
		int result = 0; //result
		Arrays.sort(nums); //sorting
		for(int  i = 0; i < nums.length ; i++){
			int j = i+1;
			int k = nums.length - 1;
			while(j < k){
				int sum =  nums[i] + nums[j]+nums[k];
				int diff = Math.abs(target - sum);
				if(diff == 0)return sum;
				if(diff < min){
					min = diff;
					result =  sum;
				}
				if(sum <= target){
					j++;
				}else{
					k--;
				}		
			}
		}
		return result;
	}
}
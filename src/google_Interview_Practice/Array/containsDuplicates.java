package google_Interview_Practice.Array;
import java.util.HashSet;
public class containsDuplicates { //Contains Duplicates
 		public boolean containDuplicates(int[] nums){
		if(nums == null || nums.length == 0){
			return false;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i :nums){
			if(!set.add(i)){
				return true;
			}
		}
		return false;
	}
}

write a method that return number of distinct pairs of integers from array of unique integers that sum to target value 
import java.util.*;
public class Pairs {
	public static int countPairs(int[] array, int targetValue) {
		if(array == null || array.length < 2) {
			return 0;
		}
		int count = 0;
		Arrays.sort(array);
		int start = 0;
		int end = array.length - 1;
		while(start < end) {
			int sum = array[start] + array[end];
			if(sum == targetValue) {
				count++;
				start++;
				end--;
				while(start < end && array[start] == array[start - 1]) {
					start++;
				}
				while(start < end && array[end] == array[end + 1]) {
					end--;
				}
			}
			else if(sum > targetValue) {
				end--;
			}
			else {
				start++;
			}
		}
		return count;
	}
}
import java.util.*;
public class Pair {
	public static int countPairs(int[] array, int targetValue) {
		if(array == null || array.length < 2) {
			return 0;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(set.contains(targetValue - array[i])) {
				count++;
			}
			else {
				set.add(array[i]);
			}
		}
		return count;
	}
}
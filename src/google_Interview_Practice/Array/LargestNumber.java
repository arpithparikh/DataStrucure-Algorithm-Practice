package google_Interview_Practice.Array;

import java.util.Arrays;
import java.util.Comparator;
//Find the Largest Number
public class LargestNumber {
	public String largestNumber(int[] nums){
		//to return the String
		StringBuffer sb =  new StringBuffer();
		//build the largest Number from looping around 	
	String[] arr = new String[nums.length];
	for(int i = 0; i < nums.length ; i++){
		arr[i] = String.valueOf(nums[i]);
	}
	Arrays.sort(arr,new Comparator<String>(){
		@Override
		public int compare(String a, String b) {
			// TODO Auto-generated method stub
			return (b+a).compareTo(a+b);
		}
	});
	for(String s: arr){
		sb.append(s);
	}
	while(sb.charAt(0) == '0' && sb.length() >1){
		sb.deleteCharAt(0);
	}
	return sb.toString();
	}
}

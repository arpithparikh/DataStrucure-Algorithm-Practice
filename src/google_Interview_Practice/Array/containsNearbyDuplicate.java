package google_Interview_Practice.Array;
import java.util.HashMap;
//Contains Near By Duplicates
public class containsNearbyDuplicate {
	//HashMap having both Integer,Integer
	public boolean containNearbyDuplicates(int[] nums,int k){
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); //HashMap
	int min = Integer.MAX_VALUE; //minimum Value 
	for(int i = 0; i < nums.length ; i++){ //Nums.length
		if(map.containsKey(nums[i])){  //map.containsKey(nums[i]) 
			int preIndex = map.get(nums[i]); //preIndex = map.get(nums[i]);
			int gap = i - preIndex; //gap => i - preIndex
			min = Math.min(min,gap); //minimum = Math.min(minimum,gap);
		}
		map.put(nums[i],i);	//Map.put(nums[i],i)
	}
	if(min <= k){ //min < = k
		return true; //true;
	}else{
		return false; //false;
	}	
	}	
}

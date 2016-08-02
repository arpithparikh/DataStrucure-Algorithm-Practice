//Majority Number 
[1,1,1,1,2,2,2] returns 1

1

//Main stuff majority of the Numbers are occured more than the half of the Array
public class Solution{
	public int majorityNumber)(ArrayList<Integer> nums){
		int count = 0; <- count the number of the Majority Number
		int candidate = 0; <- // candidate is zero
		for(int i = 0 ; i < nums.size() ; i++){
			if(count == 0){
				candidate = nums.get(0);
				count = 1;
			}else if(nums.get(i) ==  candidate){
				count ++;
			}else{
				count --;
			}
		}
		return candidate;
	}
}
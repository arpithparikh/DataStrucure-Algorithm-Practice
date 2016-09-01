package google_Interview_Practice.Array;
//Each child must have only one candy

//Can be solved using the DP 
//1..starting from the ascending order , left to right
//2..Starting from the descending order , right to left

public class Candy {

	public int candy(int[] ratings){
		
		int results = 1;
		if(ratings == null || ratings.length == 0){
			return 0;
		}
		//Candies
		int[] candies = new int[ratings.length];
		candies[0] = 1;
		
		//from left to right
		for(int i = 0; i < ratings.length ; i++){
			//dp solution
			if(ratings[i] > ratings[i -1]){
				candies[i] = candies[i - 1] + 1;
			}else{
				candies[i] = 1;
			}
		}
		//result
		int result = candies[ratings.length - 1];
		
		//from right to left
		for(int i = ratings.length - 2 ; i >=0 ; i--){
			int cur = 1;
			if(ratings[i] > ratings[i+1]){
				cur = candies[i+1] + 1;
			}
			result+= Math.max(cur, candies[i]);
			candies[i] = cur;
		}
		
		return result;
	}

}

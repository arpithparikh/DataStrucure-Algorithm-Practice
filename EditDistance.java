//if x == y, then dp[i][j] == d[i - 1][j - 1]
//if x != y, we insert y for word 1 ,then dp[i][j]        = dp[i][j - 1] +  1
//if x != y, we delete x for word 1, then dp[i][j]        = dp[i - 1][j] +  1
//if x != y, we replace x with y for word1, then dp[i][j] = dp[i-1][j-1]+1
//when x != y, dp[i][j] is the min of three situation.
//Replace, delete and insert 

public class EditDistance {
		public 	static int editDistance(String[] words1,String[] words2){
	
			
			
			return 0;
		
	}

}

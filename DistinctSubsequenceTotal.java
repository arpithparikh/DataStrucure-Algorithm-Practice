//S = "rabbit", T = "rabbit"
//S equals T
//Distinct Subsequence Total
//W(i,j) => S(0,i) equals to T(0,j)
public class DistinctSubsequenceTotal {
	//Number of Districts strings
	//String 1 and 2 
	public int numDistincts(String s, String t){
		//we have table
		int[][] table = new int[s.length() + 1][t.length() + 1];
		//
		for(int i = 0 ; i < s.length() ; i++){
			table[i][0] = 1;
		}		
		
		for(int i = 0 ; i <= s.length() ; i++){
			for(int j = 1 ; j <= t.length(); j++){
				
				if(s.charAt(i - 1) == t.charAt(j - 1)){
					table[i][j] += table[i - 1][j] + table[i - 1][j -1];
				}else{
					table[i][j] += table[i - 1][j];
				}
			}
		}
		return table[s.length()][t.length()];
	}
}

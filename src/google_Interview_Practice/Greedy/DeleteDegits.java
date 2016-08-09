//Delete The Digit 

//Find the Smallest Integer


public class Solution{
		public String DeleteDigits(String A,int k){
		StringBuilder sb = new StringBuilder(A);
		for(int i = 0 ; i < k ; i++){
			for(int j = 0; j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j+1) ; j++){
			}
			sb.delete(j,j+1);
		}
		while(sb.length() > 1 && sb.charAt(0) == '0'){
			sb.delete(0,1);
		}
			return sb.toString();	
	 } 
}
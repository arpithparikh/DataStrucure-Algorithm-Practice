package google_Interview_Practice.Array;

0 1 1 2 3 5 8

public class Fibonnaci {
	
	public int fibonnaci(int n){
		
		int first = 0;
		int second = 1;
		int curr = 0;
		for(int i = 3 ; i < n ; i++){
			
			 curr  = first + second;
			 second = curr;
			 first  = second;
		}
			return curr;
			
		
	}

}

//Fibonacci Series 

//This is the solution of the fibonnacci Series 
class Solution{
	

	public int fibonacci(int n){


		if(n==1){
			return 0;
		}

		if(n == 2){
			return 1;
		}

		int [] f = new int[n+1];

		int past = 1;

		int pastPast = 0;

		int cur = 0;

		for(int i = 0;i< n.length;i++){

			cur = past + pastPast;

			pastPast = past;

			past = cur;
		}
		return cur;

	}
}
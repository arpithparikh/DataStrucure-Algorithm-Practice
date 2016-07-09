package algorithm;

class TraillingZero
{
	
	public static long Solution(long n){


		long counter = 0;

		while(n != 0){
		
			counter+= n/5;
			n/=5;

		}
		return counter;

	}
	
	public static void main(String args[]){
		
		long number = 490;
		System.out.println(Solution(number));
	}
}
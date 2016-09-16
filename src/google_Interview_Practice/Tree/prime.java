//Number is Prime or not!
public class Prime {	
	public static boolean isPrime(int number){	
		for(int i = 2 ; i< number ;i ++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		
		int number = 4;
		System.out.print(isPrime(number));
	}

}

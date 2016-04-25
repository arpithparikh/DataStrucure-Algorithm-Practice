package Algorithms;

public class Fibonacci {
	//Recursive
	/*public static int fib(int n){
		
		if(n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
		return fib(n -1) + fib(n - 2);
	}
	*/
	//Iterative
public static int fib(int n){
		
	//1 1 2 3 5 8
		int first = 0;
		int second = 1;
		int total = 0;
		for(int i = 2 ; i<= n ;i++){
			total = first + second;
			first = second;
			second = total;
		}
		return total;
	}
	public static void main(String [] args){
		
		int n = 6;
		System.out.println(fib(n));
	}
}

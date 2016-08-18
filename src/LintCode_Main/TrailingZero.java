package LintCode_Main;
//11! = 39916800, so the out should be 2
public class TrailingZero {

	 public static long trailingZeros(long n) {
		 long sum = 0;
	        while (n != 0) {
	            sum += n / 5;
	            System.out.println(sum);
	            n /= 5;
	        }
	        return sum;
	    }	
	 public static void main(String []  args){
		 long number = 6;
		 System.out.println(trailingZeros(number));
	 }
};

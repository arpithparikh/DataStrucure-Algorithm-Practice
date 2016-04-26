package LintCode_Main;
//Count the number of k's between 0 and n. k can be 0 - 9.
//if n=12, k=1 in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], we have FIVE 1's (1, 10, 11, 12)
public class DigitCounts {
	 public int digitCounts(int k, int n) {
	        // write your code here
	        int count = 0;//count = 0;
	        for (int i = k; i <= n; i++){ //k should be between 0 or 9...
	            count += singleCount(i, k); //check whether single count
	        }
	        return count;
	    }
	    public int singleCount(int i, int k) {
	        if (i == 0 && k == 0) // i == 0 && k == 0
	            return 1;// return 1
	        int count = 0; // count = 0 
	        while (i > 0) { // i > 0
	            if (i % 10 == k) { //
	                count++;
	            }
	            i = i / 10;
	        }
	        return count;
	    }
}

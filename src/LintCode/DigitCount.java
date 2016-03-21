package LintCode;

public class DigitCount {
	  /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
	//using the brute-force
    public static int digitCounts(int k, int n) {
    	
    	int counter=0;
    	char number = Integer.toString(k).charAt(0);
    	for(int i=0;i<n;i++)
    	{
    		String res=Integer.toString(i);
    		
    		for(int j=0;j<res.length();j++)
    		{
    			if(res.charAt(j)==number)
    			{
    				System.out.println("sd");
    				counter++;
    			}
    		}
    		
    	}
    	
    	
		return counter+1;
        // write your code here
    }
    
    public static void main(String args[])
    {
    	int n=12, k=1;
    	System.out.println(digitCounts(k, n));
    }
}

package LintCode_Main;

public class APLUSB {
	  public static int aplusb(int a, int b) {
	        // write your code here, try to do it without arithmetic operators.
		  //Precondition
	        if(b==0)
	        return a;
	        else
	        return aplusb(a^b,(a&b)<<1);
	        //a^b
	        
	    }
	  
	  

}

package LintCode;
//
//Recursive sum
public class SumRecursive {
	
	public static int Add(int n1,int n2)
	{
		//Precondition
		if(n2==0)
			return n1;
		
		else
			//set bits of n1 and n2
			//Sum of bits of n1 and n2 where at least one of the bits is not set.
			// shifted by one so that adding it to n1 gives the required sum.
			return Add(n1^n2,(n1&n2)<<1);	
	}
	
	public static void main(String args[])
	{
		int n1=5,n2=6;
		System.out.println(Add(n1, n2));
	}
}

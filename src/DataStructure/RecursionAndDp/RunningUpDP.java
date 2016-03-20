//A child is climb虹ng up a stair苞ase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time. 
//Imple衫ent a method to count how many pos貞i苑le ways the child can jump up the stairs.

//Number of stairs : 3

//Number of ways = 4 ( {1,1,1}, {1,2}, {2,1}, {3} )

/*Approach:

Say child has to take n steps.
At every step the child has 3 options, to take 1 step, 2 step or 3 steps.
So if child take 1 step then find the num苑er of ways to com計lete n-1 steps +1.
Sim虹衍arly if child take 2 steps then find the num苑er of ways to com計lete n-2 steps +1.
If child take 3 step then find the num苑er of ways to com計lete n-3 steps +1.
So total num苑er of ways to com計lete n steps =
No of ways to com計lete (n-1)steps + No of ways to com計lete (n-1)steps + No of ways to com計lete (n-1)steps +1.
*/
package DataStructure.RecursionAndDp;

public class RunningUpDP {
	
	public int Jump(int n)
	{
		//precondition
		if(n<1)
			return 0;
		
		//creating empty array
		int[] f=new int[n+1];
		
		f[0]=1;
		f[1]=1;
		f[2]=2;
		f[3]=4;
		
		
		for(int i=4;i<=n;i++)
		{
			//
			f[n]=f[n-1]+f[n-2]+f[n-3];
		}
		
		return f[n];
		
	}

}

//Ugly number is a number that only have factors 2, 3 and 5
//design an algorithm to find the nth ugly number. The first 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12...


package LintCode;

public class UglyNumber {
	
/*	//if n=9 it will return 10 ugly number.
	public static int Ugly(int n)
	{
		
		int count=0;
		
		List<Integer> list=new ArrayList<Integer>();
		
		//1 is factor of all values
		list.add(1);
		
		//starting with 2
		int value=2;
		while(n+1>count)
		{
			if(value%2==0 || value%3==0 ||value%5==0)
			{
				count++;
				list.add(value);
				value++;
			}
			
		}
		
		
		return list.get(n);
	}
	*/
	//Beautiful solution
	public static int getN(int n)
	{
		//define the array
		int array[]=new int[n];
		//initialize the array[0]=1 which is precondition factor of the all the number
		array[0]=1;
		
		//Initialize the numbers
		int i2=0,i3=0,i5=0;

		//Loop over n
		for(int i=1;i<n;i++)
		{
			//next2,next3,next5
			int next2=array[i2]*2,next3=array[i3]*3,next5=array[i5]*5;
			
			//find the minimum of three
			int min=Math.min(next2, Math.min(next3, next5));
			
			//initialize the minimum 
			array[i]=min;
			
			//
			if(min==next2)
				i2++;
			if(min==next3)
				i3++;
			if(min==next5)
				i5++;
			
			
		}
		
		return array[n-1];
	}

	
	public static void main(String args[])
	{
		
		int n=9;
	/*	System.out.println(+Ugly(n));
*/		//
		System.out.println(getN(n));
	
	}
}

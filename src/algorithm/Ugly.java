//Ugly Number! nth Ugly Number 

//n  = 9, return 10

class Ugly {
	
	public static int Solution(int n){


		//Define the array the 
		int array[] = new int[n];

		//Initialize the first index as the 1
		array[0] = 1; 

		int i2=0,i3=0,i5=0;

		for(int i=1 ;i<=n;i++){

		int next2 = array[i2],next3=array[i3],next5=array[i5];

		int min =Math.min(next2,Math.min(next3,next5));

		array[i] =  min;

			if(min==next2)
				i2++;
			if(min==next3)
				i3++;
			if(min==next5)
				i5++;

		}

			return array[n-1];

	}
}
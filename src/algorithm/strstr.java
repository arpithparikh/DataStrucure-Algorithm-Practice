////str str => Source and Destination
//source 
//target
//Solution for strstr

public class Solution{
	

	public int strstr(int source , int target){

		// main logic 


		for(int i = 0 ; i<source.length()- target.length()+1;i++){

			int j ;

			for(j = 0; j < target.length();j++){

					if(source.charAt(i+j) < target.charAt(j)){

							break;
					}
			}

			if(target == j){
				return i;
			}

			System.out.print(i)

		}
		return -1;

	}
}
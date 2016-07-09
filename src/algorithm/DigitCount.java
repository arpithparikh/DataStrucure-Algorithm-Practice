package algorithm;

//digit Count 
//here the n -number , k = 1 

class DigitCount {
	
	public static int count(int k, int n){

	int count = 0;
	for(int i=k; i <= n; i++){

		count +=singleCount(i,k);
	}
		return count;
	}


	public static int singleCount(int i, int k){
		if(i == 0 && k == 0)
			return 1;
			int count = 0;
			while(i > 0){

					if(i % 10 == k){
					 	count++;
					}
					System.out.println(i);
						i = i / 10;
	
		}
		return count;

	}
	
public static void main(String args[]){
		
	
		System.out.println(singleCount(11,1));
	}

}
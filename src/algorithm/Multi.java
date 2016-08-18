//Brute Force O(N^2)
 int[] res = new int[given.length];
 int multiplication = 1;

 for(int i = 0 ; i < given.length ; i++){
	for(int j  = 0 ;j < given.length; j++){
			if(i!=j){
				multiplication = multiplication * res[j];
			}
	}			res[i] = multiplication;
}

// 
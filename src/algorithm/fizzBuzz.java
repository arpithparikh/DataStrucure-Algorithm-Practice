//Fizz Buzz

/

class fizzBuzz{
	

	public ArrayList<String> fizzBuzz(int n){
	ArrayList<String> results = new ArrayList<String>();
	for(int i = 1; i< n; i++){
	if(i%3==0 && i%5 == 0){
	results.add("fizz buzz");
	}else if(i % 5==0){
		results.add("buzz");
	}else if(i%3 == 0){
		results.add("fizz buzz")
	}else{

		results.add(String.valueof(i));
	}

	}

	}


}
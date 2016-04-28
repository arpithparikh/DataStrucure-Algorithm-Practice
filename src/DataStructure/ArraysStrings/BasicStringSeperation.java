package DataStructure.ArraysStrings;

public class BasicStringSeperation {
	
	

	
	public static void main(String args[]){
		
		String s ="Jon ancd";
		
		int k = s.indexOf(' ');
		System.out.println(k);
		String firstName = s.substring(0, k); // 0 to 3
		String lastName = s.substring(k + 1); //4 to end
		System.out.println(lastName);
	}

}




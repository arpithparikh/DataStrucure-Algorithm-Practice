public class Reverse {
	public static String reverse(String string){
		//StringBuilder
		StringBuilder sb = new StringBuilder();
		//
		for(int i = string.length() - 1 ; i>= 0;i--){
			sb.append(string.charAt(i));
			
		}
		
		return sb.toString();
		
	}
	
	//recursion
	public static String reverseString(String string){
		
		if(string == null || string.length() <= 1){
			return string;
		}
		
		return reverseString(string.substring(1))+string.charAt(0);
	}
	public static void main(String args[]){
		
		String string = "abc";
		
		System.out.print(reverse(string));
		System.out.println(reverseString(string));
	}

}

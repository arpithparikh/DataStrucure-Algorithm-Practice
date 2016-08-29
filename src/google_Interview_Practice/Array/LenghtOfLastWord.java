package google_Interview_Practice.Array;
//Length of the Last word
public class LenghtOfLastWord {
	public int lengthofLastWord(String s){
		if(s == null || s.length() == 0){
			return 0;
		}
		int result = 0; //Result
		int len = s.length(); //Length
		boolean flag = false; //flag
		for(int i = len -1 ;i >= 0 ;i--){
			char c = s.charAt(i); //character
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
				flag =true; 
				result++;
			}else{
				if(flag)
					return result;
			}
		}
		return result;
	}
}

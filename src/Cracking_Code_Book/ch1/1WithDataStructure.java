//Implement an algorithm to determine if string has all Unique characters


public class Solution{
	

	public boolen isUnique(String str){

			 char[] character = str.toCharacterArray();

			 HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

			 for(int i = 0; i < character.length();i++){

			 		if(hashMap.containsKey(character[i])){

			 			return false;
			 		}else{

			 			hashMap.put(character[i],1);
			 		}
			 }
			 return true;

	}
}
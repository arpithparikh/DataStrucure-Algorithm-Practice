//Implement an algorithm to determine if string has all Unique characters
import java.util.*;


public class Solution1{
	

	public static boolean isUnique(String str){

			 char[] character = str.toCharArray();

			 Map<Character,Integer> hashMap = new HashMap<Character,Integer>();

			 for(int i = 0; i < character.length;i++){

			 		if(hashMap.containsKey(character[i])){

			 			return false;
			 		}else{

			 			hashMap.put(character[i],1);
			 		}
			 }
			 return true;

	}

	public static void main(String args[]){

		String string = "abb";
		System.out.print("");

		System.out.print(isUnique(string));

	}
}
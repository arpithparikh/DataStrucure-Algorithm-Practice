//Making Anagram :
//Number of characters should be removed to make the two strings anagrams of each other.
//cde
//abc
//Making the Anagram
public class MakingAnagram{

		public static int NUMBER_LETTERS = 26;
		//NumberNeeded
		public static int numberNeeded(String string1, String string2){
				//characters counts
				int[] charCount1 = getCharCounts(string1);
				int[] charCount2 = getCharCounts(string2);
				//Get Delta
				return getDetla(charCount1,charCount2);
		}
		//Get character Count	
		public static int[] getCharCounts(String string){
				//character count
				int[] charcount =  new int[NUMBER_LETTERS];
				for(int i = 0 ; i < string.length(); i++){
						char c = string.charAt(i);
						int offSet =  (int) 'a';
						int charc = (int)c - offSet;
						charcount[charc]++;

				}
				return charcount;
		}

		public static int[] getDetla(int[] charCount1,int[] charCount2){
						//Basic Error Handling 
				if(charCount1.length!=array2.length){
					return -1;
				}

				int delta = 0;
				for(int i = 0 ; i < charCount1.length; i++){

					int difference = Math.abs(charCount1[i] -  charCount2[i]);
					delta += difference;
				}
				return delta;

				}

		} 

}
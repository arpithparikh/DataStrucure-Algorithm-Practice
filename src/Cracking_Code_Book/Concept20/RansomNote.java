//Ransom Note
//Check whether the we could use magazine to form the Note
public class RansomNote{
		//Can Build Ransom Note
		public static boolean canbuildRansomNote(String[] magazine, String[] note){
				HashMap<String,Integer> magazineFreq = getStringFrequency(magazine);
				HashMap<String,Integer> noteFreq = getStringFrequency(not);
				hasEnoughStrings(magazineFreq , noteFreq);
		}
		//get the String Frequency 
		public static HashMap<String,Integer> getStringFrequency(String[] string){
			HashMap<String,Integer> frequencies = new HashMap<String,Integer>();
			for(String word: string){
				if(!frequencies.containsKey(word)){
							frequencies.put(word,0);
					}else{
							frequencies.put(word,frequencies.get(word) + 1);
					}
			}
			return frequencies;
		}		

		public boolean hasEnoughStrings(HashMap<String,Integer> magazineFreq , HashMap<String,Integer> noteFreq){
				
				for(Map.Entry<String,Integer> entry :noteFreq.entrySet()){
						String word = entry.getKey();
						if(!magazineFreq.containsKey(word) || magazineFreq.get(word) < entry.getValue()){
							return false;
						}	

				}

					return true;

		}

}
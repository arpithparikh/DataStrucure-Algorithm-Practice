package google_Interview_Practice.Array;
import java.util.HashMap;
//Minimum Window subString
public class MinimumWindow {
	public String minWindow(String s, String t){
		if(t.length() > s.length()){ //
			return "";
		}
		String result = ""; //Result
		//character counter for t
		HashMap<Character,Integer> target = new HashMap<Character,Integer>();//HashMap
		for(int i = 0; i < t.length() ; i++){
			char c = t.charAt(i);
			if(target.containsKey(c)){
				target.put(c, target.get(c)+1);
			}else{
				target.put(c,1);
				
			}
		}	
		
		
		
		
		
		
		
		
		return result;
		
		
	}
}

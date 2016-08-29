package google_Interview_Practice.Array;

import java.util.HashMap;

public class IsomorphicString {

	
	public boolean isIsomorphicString(String t, String g){
		if(t == null || g == null ){
			return false;
		}
		if(t.length()!=g.length()){
			return false;
		}
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		
		for(int i = 0 ; i<t.length();i++){
			
			char c1 = t.charAt(i);
			char c2 = g.charAt(i);
			
			if(map.containsKey(c1)){
				if(map.get(c1)!=c2){
					return false;
				}
				
			}else{
				if(map.containsKey(c2))
					return false;
				map.put(c1, c2);
			}
		}
		
		return true;
		
	}
}

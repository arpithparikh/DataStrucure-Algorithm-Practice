package google_Interview_Practice.Array;
import java.util.HashSet;
//Longest SubString!
//"abcabcbb" => "abc", the length is 3.
//"bbbb" => "b", the length is 1.
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s){
		if(s == null){
			return 0;
		}
		//HashSet
		int max = 0;
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0 ; i<s.length();i++){
		for(int j = i;j < s.length() ; j++){	
			if(set.contains(s.charAt(j))){
				continue;
			}else{
				set.add(s.charAt(i));
			}
		}
		if(max < set.size()){
			max = set.size();
			set.clear();
		}
		}
		return max;
	}
}

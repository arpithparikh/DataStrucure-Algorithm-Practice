import java.util.Set;
//Simple Recursive Solution
public class WordBreak {
	public boolean wordBreak(String s,Set<String> dict){
		return wordBreakhelper(s,dict,0);
	}
	private boolean wordBreakhelper(String s, Set<String> dict, int start) {
		// TODO Auto-generated method stub
			if(start  == s.length()){
				return true;
			}
			
			for(String a:dict){
				int len = a.length(); //length 
				int end = start + len; //end
				
				if(end > s.length()){
					continue;
				}
				
				if(s.substring(start,start+len).equals(a)){
					if(wordBreakhelper(s, dict,start+len)){
						return true;
					}
				}
			}
		return false;
	}
	
	
	//DP
	
	public boolean wordBreakDp(String s,Set<String> dict){
		//boolean 
		boolean[] t = new boolean[s.length()+1];
		t[0] = true; //set first to be true , why?
		//Because we need initial state
		for(int i = 0 ; i <s.length();i++){ //loop through the length
			if(!t[i]) // t[i]
				continue;
			for(String a : dict){
				int len = a.length();
				int end = i + len;
				if(end > s.length()){
					continue;
				}
				if(t[end])continue;
				
				if(s.substring(i, end).equals(a))
					t[end] = true;
			}
		}
		return t[s.length()];
	}
}



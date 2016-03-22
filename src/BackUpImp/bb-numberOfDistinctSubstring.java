You are given a string S. 
You need to compute the number of distinct sub-strings of S.

直接撸暴力枚举
public class Solution {
	public long numberOfDistinceSubstring(String s) {
		if(s == null || s.length() == 0) {
			return 0;
		}
		HashSet<String> set = new HashSet<String>();
		long count = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				String temp = s.substring(i, j);
				if(!set.contains(temp)) {
					count++;
					set.add(temp);
				}
			}
		}
		return count;
	}
}


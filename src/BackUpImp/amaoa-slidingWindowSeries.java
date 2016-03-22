//longest substring without repeating characters
Given a string, find the length of the longest substring without repeating characters. 
For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
For "bbbbb" the longest substring is "b", with the length of 1.
时间On2，空间On，两根指针不停移动
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
        	return 0;
        }
        HashSet<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()) {
        	if(!set.contains(s.charAt(right))) {
        		set.add(s.charAt(right));
        		right++;
        	}
        	else {
        		max = Math.max(max, right - left);
        		left++;
        		right = left;
        		set.clear();
        	}
        }
        max = Math.max(max, right - left);
        return max;
    }
}

时间On，空间On 
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if(s == null || s.length() == 0) {
			return 0;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int left = 0;
		int right = 0;
		int max = 0;
		for(right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			if(!map.containsKey(c)) {
				map.put(c, right);
			}
			else {
				if(map.get(c) < left) {
					map.put(c, right);
				}
				else {
					max = Math.max(max, right - left);
					left = map.get(c) + 1;
					map.put(c, right);
				}
			}
		}
		max = Math.max(max, right - left);
		return max;
	}
}
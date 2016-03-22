Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

//brute force,检查每一个子串
时间On3，空间On
public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s == null || s.length() == 0) {
        	return 0;
        }
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
        	for(int j = i + 1; j <= s.length(); j++) {
        		String temp = s.substring(i, j);
        		if(isValid(temp)) {
        			max = Math.max(max, temp.length());
        		}
        	}
        }
        return max;
    }
    private boolean isValid(String str) {
    	HashSet<Character> set = new HashSet<Character>();
    	for(int i = 0; i < str.length(); i++) {
    		char c = str.charAt(i);
    		if(set.contains(c)) {
    			continue;
    		}
    		else {
    			set.add(c);
    			if(set.size() > 2) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}

时间On2，空间On
public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()) {
            char c = s.charAt(right);
            if(set.contains(c)) {
                right++;
            }
            else {
                if(set.size() < 2) {
                    set.add(c);
                }
                else {
                    max = Math.max(right - left, max);
                    left++;
                    right = left;
                    set.clear();
                }
            }
        }
        max = Math.max(max, right - left);
        return max;
    }
}
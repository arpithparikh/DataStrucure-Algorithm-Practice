Given an input, reverse the string word by word

public class Solution {
	public String reverseWords(String s) {
		if(s == null || s.length() == 0) {
			return "";
		}
		s = s.trim();
		String[] str = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i = str.length - 1; i >= 0; i--) {
			if(str[i].length() > 0) {
				sb.append(str[i]);
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}
}


public class Solution {
    public void reverseWords(char[] s) {
        if(s == null || s.length == 0) {
            return;
        }
        int left = 0;
        int right = 0;
        doReverse(s, 0, s.length - 1);
        while(right < s.length) {
        	while(right < s.length && s[right] != ' ') {
        		right++;
        	}
        	doReverse(s, left, right - 1);
        	right++;
        	left = right;
        }
        doReverse(s, left, right - 1);
    }
    private void doReverse(char[] s, int left, int right) {
    	for(int i = 0; left + i < right - i; i++) {
    		char temp = s[left + i];
    		s[left + i] = s[right - i];
    		s[right - i] = temp;
    	}
    }
}
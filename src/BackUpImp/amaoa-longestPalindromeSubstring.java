public class Palindrome {
	public static String longestPalindromeSubstring(String S) {
		if(S == null || S.length() == 0) {
			return new String();
		}
		//这一步真的很重要，切记
		String max = S.substring(0, 1);
		for(int i = 0; i < S.length() - 1; i++) {
			String temp = helper(S, i, i);
			if(temp.length() > max.length()) {
				max = temp;
			}
			temp = helper(S, i, i + 1);
			if(temp.length() > max.length()) {
				max = temp;
			}
		}
		return max;
	}
	private String helper(String s, int left, int right) {
		if(left < 0 || right >= s.length) {
			return new String();
		}
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
}

DP
public class Solution {
    /**
     * @param s input string
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // Write your code here
        if(s == null || s.length() == 0) {
            return new String();
        }
        int length = s.length();
        String res = "";
        boolean[][] f = new boolean[length][length];
        for(int i = 0; i < length; i++) {
            f[i][i] = true;
        }
        for(int i = 0; i < length - 1; i++) {
            f[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
        }
        for(int i = 2; i < length; i++) {
            for(int j = 0; i + j < length; j++) {
                f[j][i + j] = f[j + 1][i + j - 1] && (s.charAt(j) == s.charAt(i + j));
            }
        }
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(f[i][j] == true) {
                    String temp = s.substring(i, j + 1);
                    if(temp.length() > res.length()) {
                        res = temp;
                    }
                }
            }
        }
        return res;
    }
}
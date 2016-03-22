public class Solution {
	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		if(s == null || s.length() == 0) {
			return res;
		}
		List<String> temp = new ArrayList<String>();
		helper(s, res, temp, 0);
		return res;
	}
	private void helper(String s, List<List<String>> res, List<String> temp, int index) {
		if(index == s.length()) {
			res.add(new ArrayList<String>(temp));
			return;
		}
		for(int i = index + 1; i <= s.length(); i++) {
			String prefix = s.substring(index, i);
			if(!isPalindrome(prefix)) {
				continue;
			}
			temp.add(prefix);
			helper(s, res, temp, i);
			temp.remove(temp.size() - 1);
		}
	}
	private boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		for(int i = 0; start + i < end - i; i++) {
			if(s.charAt(start + i) != s.charAt(end - i)) {
				return false;
			}
		}
		return true;
	}
}
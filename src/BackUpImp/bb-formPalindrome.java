public class formPalindrome {
	public String form(String s) {
		if(s == null || s.length() < 2) {
			return s;
		}
		boolean isP = true;
		int index = 0;
		//find the maximum length palindromic string from end to start
		while(index < s.length()) {
			if(s.charAt(index) == s.charAt(s.length() - 1)) {
				isP = true;
				int left = index + 1;
				int right = s.length() - 2;
				while(left < right) {
					if(s.charAt(left) == s.charAt(right)) {
						left++;
						right--;
					}
					else {
						isP = false;
						break;
					}
				}
				if(isP) {
					break;
				}
			}
			index++;
		}
		StringBuffer sb = new StringBuffer(s);
		for(int i = index - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public String form1(String s) {
		int index = s.length() - 1;
		while(index >= 0) {
			if(isPalindrome(s.substring(index, s.length()))) {
				index--;
			}
			else {
				break;
			}
		}
		StringBuffer sb = new StringBuffer(s);
		for(int i = index; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
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
    public static void main(String[] args) {
    	formPalindrome f = new formPalindrome();
        String s = "abc";
        System.out.println(f.form(s));
    }
 }
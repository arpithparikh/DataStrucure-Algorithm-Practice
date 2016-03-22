input： "aaabb".
output: "3a2b"

input: "aaaabbba".
output:"4a3ba"


public class Compress {
	public String compress(String s) {
		if(s == null || s.length() == 0) {
			return new String();
		}
		StringBuffer sb = new StringBuffer();
		int left = 0;
		int right = 0;
		while(right < s.length()) {
			while(right < s.length() && s.charAt(left) == s.charAt(right)) {
				right++;
			}
			if(right - left > 1) {
				sb.append(right - left);
			}
			sb.append(s.charAt(left));
			left = right;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Compress c = new Compress();
		String s1 = "aaaabbba";
		String s2 = "aaabb";
		System.out.println(s.compress(s1));
		System.out.println(s.compress(s2));
	}
}


、、decode
//a#3bd#5 -》 aaabddddd
public class change1 {
	public String change(String s){
		if(s == null || s.length() == 0) {
			return new String();
		}
		int left = 0;
		int right = 0;
		StringBuffer sb = new StringBuffer();
		for(right = 0; right < s.length(); ) {
			if(s.charAt(right) >= 'a' && s.charAt(right) <= 'z') {
				right++;
			}
			else if(s.charAt(right) == '#') {
				sb.append(s.substring(left, right));
				char c = s.charAt(right - 1);
				right++;
				int numStart = right;
				while(right < s.length() && s.charAt(right) >= '0' && s.charAt(right) <= '9') {
					right++;
				}
				int count = Integer.parseInt(s.substring(numStart, right));
				helper(sb, count, c);
				left = right;
			}
		}
		if(left < s.length()) {
			sb.append(s.substring(left, right));
		}
		return sb.toString();
	}
	private void helper(StringBuffer sb, int count, char c) {
		while(--count > 0) {
			sb.append(c);
		}
	}
	public static void main(String[] args) {
		change1 c = new change1();
		String s = "a#3bd#10";
		System.out.print(c.change(s));
	}
}
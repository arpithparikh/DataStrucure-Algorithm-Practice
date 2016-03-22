public class delete {
	public String delete(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
		s = s.trim();
		StringBuffer sb = new StringBuffer();
		int index = 0;
		while(index < s.length()) {
			if(s.charAt(index) != ' ') {
				sb.append(s.charAt(index));
				
			}
			if(s.charAt(index) == ' ' && s.charAt(index - 1) != ' ') {
				sb.append(s.charAt(index));
			}
			if(s.charAt(index) == ' ' && s.charAt(index - 1) == ' ') {
				index++;
			}
			index++;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		delete d = new delete();
		System.out.print(d.delete("sky       is   blue"));
	}
}
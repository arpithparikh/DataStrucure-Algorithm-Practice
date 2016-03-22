public class change{
	public void intToString(int num) {
		StringBuffer sb = new StringBuffer();
		while(num != 0) {
			int digit = num % 10;
			sb.append(digit + "");
			num /= 10;
		}
		System.out.print(doReverse(sb).toString());
	}
	private StringBuffer doReverse(StringBuffer sb) {
		int start = 0;
		int end = sb.length() - 1;
		for(int i = 0; start + i < end - i; i++) {
			char temp = sb.charAt(start + i);
			sb.setCharAt(start + i, sb.charAt(end - i));
			sb.setCharAt(end - i, temp);
		}
		return sb;
	}
	public static void main(String[] args) {
		change c = new change();
		int num = 123456;
		c.intToString(num);
	}
}
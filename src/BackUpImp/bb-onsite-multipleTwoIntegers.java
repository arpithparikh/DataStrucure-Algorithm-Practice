public class Solution {
	public int multiple(int a, int b) {
		int res = 0;
		while(b != 0) {
			if(b == 1) {
				return a;
			}
			a = (a << 1);
			b = (b >> 1);
		}
		return res;
	}
}
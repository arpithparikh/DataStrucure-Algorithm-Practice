bitPerWord = 32
shift = 5, because 2 ^ 5 = 32
mask Ox1F
N = 10000000
public class Solution {
	public void bitMap(int n) {
		//实现了三步
		//求十进制的0-N对应在数组a中的下标 n / 32
		// 求0-N对应 0-31中的数， N % 32 = M
		// 利用移位0-31使得对应32bit位为1， 1 << M
		n = 10000000;
		int bitPerWord = 32;
		int shift = 5;
		int mask = Ox1F;
		int[] a = new int[1 + n / 32];
		//设置所在位上的bit为1
		private void set(int i) {
			//这里首先要确定的是对应哪一个bit，即哪一个A[]
			//所以需要得到除以32后的商，然后这里32是2的5次方，所以用右移5位来表示除以32后的商
			//即是a[i >> shift]，同 i / 32
			a[i >> shift] |= (1 << (i & mask));
			//等价于a[i / 32] |= (1 << (i % 32));
			//十六进制的Ox1F，转换为十进制就是31，二进制为0001 1111
			//i & 0001 1111相当于是保留i的后五位，相当于是取余的意思
			// 比如23，二进制位0001 0111，那么
			// 0001 0111 & 0001 1111 = 0001 0111，十进制为23
			// i& mask相当于是 i % 32的意思
			//然后 |= 是进行set bit的操作，只要为1，那么对应A【】上的对应位就是1
		}
		//初始化所有的bit 位为0
		private void clear(int i) {
			a[i >> shift] &= ~(1 << (i & MASK));
		}
		//test 测试所在的bit位是否为1
		private int test(int i) {
			return a[i >> shift] & (1 << (i & mask));
		}
	}
	public static void main(String[] args) {
		int i;
		for(i = 0; i < n; i++) {
			clear(i);
		}
		set(1);

	}
}
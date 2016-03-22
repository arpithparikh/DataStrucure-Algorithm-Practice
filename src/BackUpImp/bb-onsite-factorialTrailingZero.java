public class Solution {
    public int trailingZeroes(int n) {
        if(n < 5) {
            return 0;
        }
        int count = 0;
        while(n != 0) {
            //加上的是它自己这个数本身可以提供多少个0
            count += (n / 5);
            //计算完之后再去看
            n /= 5;
        }
        return count;
    }
}
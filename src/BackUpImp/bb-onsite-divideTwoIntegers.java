public class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) {
            return 0;
        }
        if(divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNeg = false;
        if((dividend < 0) ^ (divisor < 0)) {
            isNeg = true;
        }
        long num1 = Math.abs((long)dividend);
        long num2 = Math.abs((long)divisor);
        int res = 0;
        while(num1 >= num2) {
            int count = 0;
            while(num1 >= (num2 << count)) {
                count++;
            }
            count--;
            long temp = (num2 << count);
            num1 %= temp;
            res += (1 << count);
        }
        return isNeg ? -res : res;
    }
}



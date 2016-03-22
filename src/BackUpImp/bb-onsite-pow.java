public class Solution {
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        if(n == 1) {
            return x;
        }
        boolean isInverted = false;
        if(n < 0) {
            isInverted = true;
        }
        long newPow = Math.abs((long)n);
        double res = helper(x, newPow);
        return isInverted ? 1 / res : res;
    }
    private double helper(double x, long n) {
        if(n == 0) {
            return 1.0;
        }
        if(n == 1) {
            return x;
        }
        double half = helper(x, n / 2);
        double rest = helper(x, n - n / 2 - n / 2);
        return half * half * rest;
    }
}
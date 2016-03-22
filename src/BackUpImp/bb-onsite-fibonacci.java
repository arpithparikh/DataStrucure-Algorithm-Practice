class Solution {
    public int fibonacci(int n) {
        // write your code here
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        int first = 0;
        int second = 1;
        n -= 2;
        int third;
        while(n-- > 0) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}


class Solution {
    public int fibonacci(int n) {
        if(n < 1) {
            return 0;
        }
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}

class Solution {
    public int fibonacci(int n) {
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i < n; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
        return f[n - 1];
    }
}


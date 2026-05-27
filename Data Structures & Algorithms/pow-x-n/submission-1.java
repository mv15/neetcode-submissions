class Solution {
    public double myPow(double x, int n) {
        
        if(n < 0) {
            n = -n;
            x = 1/x;
        }

        return power(x, n);
    }

    public double power(double x, int n) {
        if (n == 0)
            return 1;
        
        double ans = power(x, n/2);
        if (n % 2 == 0) {
            return ans * ans;
        }

        return x * ans * ans;
    }
}

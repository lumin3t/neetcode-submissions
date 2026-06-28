class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        if (n==0) return ans;
        int exponent = n;
        if (n<0) {
            x = 1/x;
            exponent = -exponent;
        }
        while (exponent > 0) {
            if (exponent%2==1){
                ans*=x;
            }
            x*=x;
            exponent/=2;
        }
        return ans;
    }
}

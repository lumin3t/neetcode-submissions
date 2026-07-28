class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x<0) negative=true;
        if(negative) x*=-1;
        int num=x;
        if (num == Integer.MIN_VALUE) return 0;
        int rev=0;
        while(num>=1) {
            int digit = num%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            rev = rev*10 + digit;
            num/=10;
        }
        return (negative) ? rev*-1 : rev;
    }
}

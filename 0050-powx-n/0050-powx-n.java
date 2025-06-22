class Solution {
    public double myPow(double x, int n) {
        if(x==0||x==1)
            return x;
        if(n==0)
            return 1;
        if(n==1)
            return x;
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double result = 1.0;
        while (N > 0) {
            if (N % 2 == 1) { // If N is odd
                result *= x;
            }
            x *= x; // Square x
            N /= 2; // Halve N
        }
        return result;
    }
}
class Solution {
    public int trailingZeroes(int n) {
        int ct=0;
        while(n>=5)
        {
            n/=5;
            ct+=n;
        }
        return ct;
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        else if(n%4==0)
        return isPowerOfFour(n/4);
        return n==1;
        
    }
}
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)
        return false;
        else if(n%3==0)
        return isPowerOfThree(n/3);
        return n==1;
    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n>0){
            if(n==1){
                return true;
            }
            int rem=n%2;
            if(rem==1){
                return false;
            }
            n=n/2;
        }
        return false;
    }
}
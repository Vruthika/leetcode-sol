class Solution {
    public int numberOfSteps(int num) {
        int ct=0;
        while(num!=0)
        {
            if(num%2==0)
            {
                ct++;
                num/=2;
            }
            else
            {
                num-=1;
                ct++;
            }
        }
        return ct;
    }
}
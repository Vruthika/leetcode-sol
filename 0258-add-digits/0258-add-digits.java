class Solution {
    public int tot(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>9)
        {
            num=tot(num);
        }
        return num;
    }
}
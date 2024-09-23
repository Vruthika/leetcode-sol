class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5=0,c10=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                c5+=1;
            }
            else if(bills[i]==10)
            {
                if(c5==0)
                return false;
                else
                {
                    c10+=1;
                    c5-=1;
                }
            }
            else if(bills[i]==20)
            {
                if(c10>=1 && c5>=1)
                {
                    c10-=1;
                    c5-=1;
                }
                else if(c5>=3)
                {
                    c5-=3;
                }
                else
                return false;
            }
        }
        return true;
    }
}
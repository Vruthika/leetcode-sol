class Solution {
    public boolean judgeCircle(String moves) {
        int sum=0;
        for(int i=0;i<moves.length();i++)
        {
            char c=moves.charAt(i);
            if(c=='U')
                sum+=1;
            else if(c=='D')
                sum-=1;
            else if(c=='L')
                sum+=5;
            else if(c=='R')
                sum-=5;
        }
        return sum==0;
    }
}
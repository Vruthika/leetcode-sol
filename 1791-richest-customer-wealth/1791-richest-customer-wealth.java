class Solution {
    public int maximumWealth(int[][] acc) {
        int max=0,v=0;
        for(int i=0;i<acc.length;i++)
        {
            v=0;
            for(int j=0;j<acc[0].length;j++)
            {
                v+=acc[i][j];
            }
            max=Math.max(v,max);
        }
        return max;
    }
}
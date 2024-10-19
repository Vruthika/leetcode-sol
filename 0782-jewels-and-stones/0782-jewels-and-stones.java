class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ct=0;
        for(int i=0;i<jewels.length();i++)
        {
            char c1=jewels.charAt(i);
            for(int j=0;j<stones.length();j++)
            {
                char c2=stones.charAt(j);
                if(c1==c2)
                {
                    ct+=1;
                }
            }
        }
        return ct;
    }
}
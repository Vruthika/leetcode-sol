class Solution {
    public int[] getConcatenation(int[] nums) {
        int res[]=new int[2*nums.length];
        int j=0;
        for(int i:nums)
        {
            res[j++]=i;
        }
        for(int i:nums)
        {
            res[j++]=i;
        }
        return res;
    }
}
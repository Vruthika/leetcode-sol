class Solution {
    public int findNumbers(int[] nums) {
        int ct=0;
        for(int i:nums)
        {
            int d=(int)(Math.log10(i)+1);
            if(d%2==0)
            ct+=1;
        }
        return ct;
    }
}
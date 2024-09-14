class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i:nums)
        {
            max=Math.max(max,i);
        }
        int longest=0,currlen=0;
        for(int i:nums){
            if(i==max)
            {
                currlen+=1;
                longest=Math.max(longest,currlen);
            }
            else
            {
                currlen=0;
            }
        }
        return longest;
    }
}
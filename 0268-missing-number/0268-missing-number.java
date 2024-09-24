class Solution {
    public int missingNumber(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++)
        {
            tot+=nums[i];
        }
        int sum=nums.length*(nums.length+1)/2;
        return sum-tot;
    }
}
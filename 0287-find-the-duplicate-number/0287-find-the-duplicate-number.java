class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int r=0;
        boolean fl=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
            {
                r=nums[i];
                fl=true;
                break;
            }
        }
        return r;
    }
}
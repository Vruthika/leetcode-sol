class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0)
        return 0;
        boolean fl=true;
        int r=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]!=1)
            {
                fl=false;
                r=i+1;
            }
        }
        if(fl==true)
        r=nums.length;
        return r;
    }
}
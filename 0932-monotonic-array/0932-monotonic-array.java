class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc=false;
        boolean desc=false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i])
                asc=true;
            else if(nums[i]>nums[i+1])
                desc=true;
        }
        if(asc && desc)
            return false;
        return true;

    }
}
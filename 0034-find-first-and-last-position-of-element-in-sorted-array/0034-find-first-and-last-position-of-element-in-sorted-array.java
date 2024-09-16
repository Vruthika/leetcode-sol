class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] list=new int[]{-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(list[0]==-1)
                    list[0]=i;
                list[1]=i;
            }
        }
        return list;
    }
}
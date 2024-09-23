class Solution {
    private Random random=new Random();
    private int[] nums;
    public Solution(int[] nums) {
        this.nums=nums;
    }
    public int pick(int target) {
        int ct=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ct+=1;
                int x=1+random.nextInt(ct);
                if(x==ct)
                {
                    ans=i;
                }
            }
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
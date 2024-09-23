class Solution {
    private Random random;
    private int[] nums;
    public Solution(int[] nums) {
        this.nums=nums;
        random=new Random();
    }
    
    public int pick(int target) {
        List<Integer> targetlist=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                targetlist.add(i);
            }
        }
        int randomIndex=random.nextInt(targetlist.size());
        return targetlist.get(randomIndex);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
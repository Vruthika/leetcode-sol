class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet=new HashSet<>();
        for(int n:nums)
        {
            numsSet.add(n);
        }
        return numsSet.size()<nums.length;
    }
}
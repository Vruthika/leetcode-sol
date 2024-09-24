class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>=2)
            {
                return true;
            }
        }
        return false;*/

        Set<Integer> numsSet=new HashSet<>();
        for(int n:nums)
        {
            numsSet.add(n);
        }
        return numsSet.size()<nums.length;
    }
}
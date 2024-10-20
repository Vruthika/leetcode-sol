class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>(); //key and value both r integers
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); //already present in map=>fetches freq+1 or sets freq to 0+1
        }
        int s=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>s) //fetches the value from key-value pair
            {
                return nums[i];
            }
        }
        return 0;
    }
}
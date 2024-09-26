class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++)
            {
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        for(var r:map.entrySet())
        {
            if(r.getValue()==nums.length)
            {
                res.add(r.getKey());
            }
        }
        Collections.sort(res);
        return res;
    }
}
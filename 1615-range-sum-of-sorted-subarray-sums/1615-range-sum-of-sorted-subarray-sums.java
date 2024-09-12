class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                list.add(sum);
            }

        }
        Collections.sort(list);
        int sum=0;
        int MOD = 1_000_000_007; 
        for(int i=left-1;i<right;i++)
        {
            sum=(sum+list.get(i))%MOD;
        }
        return sum;
    }
}
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int l=triangle.size();
        int res=0;
        for(int i=l-2;i>=0;i--)
        {
            List<Integer> curr=triangle.get(i);
            List<Integer> next=triangle.get(i+1);
            for(int j=0;j<curr.size();j++)
            {
                curr.set(j,curr.get(j)+Math.min(next.get(j),next.get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
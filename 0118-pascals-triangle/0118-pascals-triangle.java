class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> r=new ArrayList<>();
            r.add(1);
            for(int j=1;j<i;j++)
            {
                r.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            if(i>0)    
                r.add(1);
            res.add(r);
        }
        return res;
    }
}
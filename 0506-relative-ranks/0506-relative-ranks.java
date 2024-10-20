class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] res=new String[n];
        int sortarr[]=score.clone();
        Arrays.sort(sortarr);
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                map.put(sortarr[n-1-i],"Gold Medal");
            }
            else if(i==1)
            {
                map.put(sortarr[n-1-i],"Silver Medal");
            }
            else if(i==2)
            {
                map.put(sortarr[n-1-i],"Bronze Medal");
            }
            else
            {
                map.put(sortarr[n-i-1],String.valueOf(1+i));
            }
        }
        for(int i=0;i<n;i++)
        {
            res[i]=map.get(score[i]);
        }
        return res;
    }
}
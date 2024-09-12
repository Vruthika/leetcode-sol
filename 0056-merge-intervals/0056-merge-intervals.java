class Solution {
    public int[][] merge(int[][] arr) {
        if(arr.length==0)
            return new int[0][];
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> l=new ArrayList<>();
        int curr[]=arr[0];
        l.add(curr);
        for(int[] i:arr)
        {
            int ce=curr[1];
            if(i[0]<=ce)
            {
                curr[1]=Math.max(ce,i[1]);
            }
            else
            {
                curr=i;
                l.add(curr);
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}
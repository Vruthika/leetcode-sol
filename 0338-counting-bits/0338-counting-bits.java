class Solution {
    public int[] countBits(int n) {
        String a[]=new String[n+1];
        int res[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            a[i]=Integer.toBinaryString(i);
        }
        for(int i=0;i<n+1;i++){
            res[i]=Integer.parseInt(a[i],2);
            res[i]=Integer.bitCount(res[i]);
        }

        return res;
    }
}
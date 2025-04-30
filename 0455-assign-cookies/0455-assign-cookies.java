class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ct=0;
        Arrays.sort(s);
        Arrays.sort(g);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                ct+=1;
                i+=1;
                j+=1;
            }
            else{
                j+=1;
            }
        }
        return ct;
    }
}
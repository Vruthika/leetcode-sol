class Solution {
    public int scoreOfString(String s) {
        int rank=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            int v=Math.abs(ch[i]-ch[i+1]);
            rank+=v;
        }
        return rank;
    }
}
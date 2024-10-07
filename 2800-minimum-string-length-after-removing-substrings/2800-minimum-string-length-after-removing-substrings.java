class Solution {
    public int minLength(String s) {
        int ct=s.length();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length()-1;i++)
        {
            if((str.charAt(i)=='A' && str.charAt(i+1)=='B') || (str.charAt(i)=='C' && str.charAt(i+1)=='D'))
            {
                ct-=2;
                str.delete(i,i+2);
                i=Math.max(-1,i-2);
            }
        }
        return ct;
    }
}
class Solution {
    public void reverseString(char[] s) {
        String str="";
        int l=0,r=s.length-1;
        while(l<r)
        {
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }
        String[] result = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = "\"" + s[i] + "\"";
        }
        
        
    }
}
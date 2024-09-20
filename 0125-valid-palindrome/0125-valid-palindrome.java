class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");  
        String s="";
        char c;
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            s=c+s;
        }
        return str.equals(s);
    }
}
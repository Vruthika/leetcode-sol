class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder s=new StringBuilder();
        int i=0,j=0;
        while (i < w1.length() && j < w2.length()) {
            s.append(w1.charAt(i++));
            s.append(w2.charAt(j++));
        }
        if (i < w1.length()) {
            s.append(w1.substring(i));
        }
        if (j < w2.length()) {
            s.append(w2.substring(j));
        }
        return s.toString();
    }
}
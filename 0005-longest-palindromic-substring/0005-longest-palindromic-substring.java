class Solution {
    private String exploreCentre(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }   

    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return "";
        }

        String longest="";
        for(int i=0;i<s.length();i++){
            String l1=exploreCentre(s,i,i);
            String l2=exploreCentre(s,i,i+1);
            if(l1.length()>longest.length())
                longest=l1;
            if(l2.length()>longest.length())
                longest=l2;
        }
        return longest;
    }

}
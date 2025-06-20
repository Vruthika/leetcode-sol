class Solution {
    private int exploreCentre(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }   

    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return "";
        }

        int st=0,end=0;
        for(int i=0;i<s.length();i++){
            int l1=exploreCentre(s,i,i);
            int l2=exploreCentre(s,i,i+1);
            int currmax=Math.max(l1,l2);

            if(currmax>(end-st+1)){
                st=i-(currmax-1)/2;
                end=i+currmax/2;
            }
        }
        return s.substring(st,end+1);
    }

}
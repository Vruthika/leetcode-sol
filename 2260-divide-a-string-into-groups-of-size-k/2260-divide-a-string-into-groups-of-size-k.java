class Solution {
    public String[] divideString(String s, int k, char fill) {
        if(s.length()%k!=0){
            for(int i=0;i<(s.length()%k);i++){
                s=s+fill;
            }
        }
        int j=0;
        String res[]=new String[s.length()/k];
        for(int i=0;i<s.length();i+=k){
            String a=s.substring(i,i+k);
//            System.out.println(a);
            res[j++]=a;
        }
     //   System.out.println(s);
        return res;
    }
}
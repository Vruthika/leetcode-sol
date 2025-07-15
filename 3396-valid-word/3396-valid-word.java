class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int v=0,cc=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(!((c>='0' && c<='9')||(c>='A' && c<='Z')||(c>='a' && c<='z'))){
                return false;
            }
            if((c>='a' && c<='z')||(c>='A' && c<='Z')){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    v+=1;
                }
                else{
                    cc+=1;
                }

            }
        }
        if(cc==0 || v==0){
            return false;
        }
        return true;
    }
}
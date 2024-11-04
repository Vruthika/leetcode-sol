class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ct=0;
        for(int i=left;i<=right;i++)
        {
            char st=words[i].charAt(0);
            if(st=='a' || st=='e' || st=='i' || st=='o' || st=='u')
            {
                char e=words[i].charAt(words[i].length()-1);
                 if(e=='a' || e=='e' || e=='i' || e=='o' || e=='u')
                 {
                    ct+=1;
                 }

            }
        }
        return ct;
    }
}
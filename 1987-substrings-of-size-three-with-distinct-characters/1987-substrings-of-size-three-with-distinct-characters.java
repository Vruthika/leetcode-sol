class Solution {
    public int unique(String str)
    {
        Set<Character> set=new HashSet<>();
        for(char c:str.toCharArray())
        {
            if(set.contains(c))
            {
                return 0;
            }
            set.add(c);
        }
        return 1;
    }
    public int countGoodSubstrings(String s) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<s.length()-2;i++)
        {
            l.add(s.substring(i,i+3));
        }
        int ct=0;
        for(String a:l)
        {
            if(unique(a)==1)
                ct+=1;
        }
        return ct;

    }
}
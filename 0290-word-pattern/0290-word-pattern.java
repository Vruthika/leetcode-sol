class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
            return false;
        
        Map<Character,String> ctow=new HashMap<>();
        Map<String,Character> wtoc=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String w=words[i];
            if(ctow.containsKey(c))
            {
                if(!ctow.get(c).equals(w))
                {
                    return false;
                }
            }
            else
            {
                if(wtoc.containsKey(w))
                {
                    return false;
                }
                ctow.put(c,w);
                wtoc.put(w,c);
            }
        }
        return true;
    }
}
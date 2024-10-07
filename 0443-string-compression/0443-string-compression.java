class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        while(i<chars.length)
        {
            char curr=chars[i];
            int ct=0;
            while(i<chars.length && chars[i]==curr)
            {
                ct+=1;
                i++;
            }
            chars[idx++]=curr;
            if(ct>1)
            {
                for(char c:String.valueOf(ct).toCharArray())
                {
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}
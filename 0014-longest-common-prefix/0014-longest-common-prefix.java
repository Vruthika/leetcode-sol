class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
        /*String res="";
        int fl=0,j=0,ct=0;
        if(strs.length==1)
        return strs[0];
        
        
        for(int i=0;i<strs.length-1;i++)
        {
            int m=Math.min(strs[i].length(),strs[i+1].length());
            //System.out.println(m);
            for(j=0;j<=m;j++)
            {
                String s1=strs[i].substring(0,j);
                String s2=strs[i+1].substring(0,j);
                System.out.print(s1+" "+s2+"//");
                if(s1.equals(s2))
                {
                    res=s1;
                    System.out.println(res);
                    ct+=1;
                }
            }
        }
        return res;
    }
}*/
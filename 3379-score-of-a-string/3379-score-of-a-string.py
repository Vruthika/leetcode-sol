class Solution:
    def scoreOfString(self, s: str) -> int:
        sc=0
        for i in range(0,len(s)-1):
            r=abs(ord(s[i+1])-ord(s[i]))
            #print(r,end=' ')
            sc+=r
            #print(sc)
        return sc
        